package org.eclipse.uml.verification.handlers;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.papyrus.infra.onefile.model.ISubResourceFile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml.verification.model.checkers.Conversions;
import org.eclipse.uml.verification.model.checkers.NusmvLauncher;
import org.eclipse.uml.verification.model.checkers.PesLauncher;
import org.eclipse.uml.verification.model.checkers.SpinLauncher;
import org.eclipse.uml.verification.model.checkers.UppaalLauncher;
import org.eclipse.uml.verification.model.checkers.mappingNamesFactory;
import org.eclipse.uml.verification.transformations.Graph2OptGraph;
import org.eclipse.uml.verification.transformations.HGraphtoFGraph;
import org.eclipse.uml.verification.transformations.UML2Graph;
import org.eclipse.uml.verification.view.MyView;
import org.osgi.framework.Bundle;


/**
 * This class handles The verification of the uml files.  It is loaded when the
 * user selects very from the plugins drop-down menu
 * @author John
 *
 */
public class VerifyHandler extends AbstractHandler{

	protected static String choice="";
	
	/**
	 * The property file. Stores module list, the metamodel and library locations.
	 * @generated
	 */
	private Properties properties;
	
	public VerifyHandler() throws IOException {
		properties = new Properties();
		properties.load(getFileURL("/M2M/HGraphtoFGraph.properties").openStream());
	}



	/**
	 * 
	 * locates the address of the file name passed in with
	 * respect to the plugins bundle
	 * 
	 * @param fileName file to search for
	 * @return URI of the file given
	 */
	private URI getFileLoc(String fileName) {
		Bundle bundle = Platform.getBundle("org.eclipse.uml.verification");

		URL fileURL = bundle.getEntry(fileName);
		File file = null;
		try {
			URL resolvedFileURL = FileLocator.toFileURL(fileURL);


			URI resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);


			file = new File(resolvedURI);
		} catch (Exception e1) {

			e1.printStackTrace();
		} 
		return file.toURI();
	}


	/**
	 * handles the verification process
	 * @param event selection of the verify button
	 * 
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Shell verificationShell = new Shell(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), SWT.SHELL_TRIM | SWT.CENTER);

		if (choice.equals("")) {
			Rectangle screenSize = verificationShell.getDisplay().getPrimaryMonitor().getBounds();
			verificationShell.setLocation((screenSize.width - verificationShell.getBounds().width) / 2, ((screenSize.height - verificationShell.getBounds().height) / 2) - 100);
			MessageDialog.openError(verificationShell, "error", "You must select a model checker");
			return null;
		}


		MyView.getResultsEditor().setText("");
		/* enables output to the user console */
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		MessageConsole myConsole = null;
		for (int i = 0; i < existing.length; i++) {
			if ("verification".equals(existing[i].getName())){
				myConsole = (MessageConsole) existing[i];
			}
		}

		if (myConsole == null) {
			myConsole = new MessageConsole("verification", null);
			conMan.addConsoles(new IConsole[]{myConsole});
		}


		final MessageConsoleStream out = myConsole.newMessageStream();
		out.getConsole().clearConsole();






		/* get the current workbench */
		IWorkbench currentWorkbench = PlatformUI.getWorkbench();
		IWorkbenchWindow currentWorkbenchWindow = currentWorkbench.getActiveWorkbenchWindow();

		final IProject currProject;
		final IResource umlFile;
		if (currentWorkbenchWindow != null) {
			

			
			
			 IWorkbenchPage activePage = currentWorkbenchWindow.getActivePage();
			 ISelection selection2 = activePage.getSelection();
			 
			 if (!(selection2 instanceof TreeSelection)) {
				 	Rectangle screenSize = verificationShell.getDisplay().getPrimaryMonitor().getBounds();
					verificationShell.setLocation((screenSize.width - verificationShell.getBounds().width) / 2, ((screenSize.height - verificationShell.getBounds().height) / 2) - 100);
					MessageDialog.openError(verificationShell, "error", "You must select a uml model (*.uml) to be verified");
					return null;
			 }
			 
			    
			    
			/* determine what the user has selected */
			IStructuredSelection selection = (IStructuredSelection) currentWorkbenchWindow.getSelectionService().getSelection();
			
			
			
			

			/* cannot verify if the user has not selected anything to be verified */
			if (selection.getFirstElement() == null) {
				Rectangle screenSize = verificationShell.getDisplay().getPrimaryMonitor().getBounds();
				verificationShell.setLocation((screenSize.width - verificationShell.getBounds().width) / 2, ((screenSize.height - verificationShell.getBounds().height) / 2) - 100);
				MessageDialog.openError(verificationShell, "error", "You must select a uml model (*.uml) to be verified");
				return null;
			}






			if (selection.getFirstElement() instanceof ISubResourceFile) {

				ISubResourceFile tmp = (ISubResourceFile)selection.getFirstElement();
				IFile uml = tmp.getFile();


				if (!uml.getFileExtension().equals("uml")) {
					Rectangle screenSize = verificationShell.getDisplay().getPrimaryMonitor().getBounds();
					verificationShell.setLocation((screenSize.width - verificationShell.getBounds().width) / 2, ((screenSize.height - verificationShell.getBounds().height) / 2) - 100);
					MessageDialog.openError(verificationShell, "error", "You must select a uml model (*.uml) to be verified");
				}



				if (!tmp.getProject().getFile("DMOSESprofile.profile.uml").exists()) {
					Rectangle screenSize = verificationShell.getDisplay().getPrimaryMonitor().getBounds();
					verificationShell.setLocation((screenSize.width - verificationShell.getBounds().width) / 2, ((screenSize.height - verificationShell.getBounds().height) / 2) - 100);
					MessageDialog.openError(verificationShell, "error", "The project must contain the DMOSES profile to be verified");

					
					return null;
				}


				currProject = tmp.getProject();
				umlFile = tmp.getFile();

			}

			else if (selection.getFirstElement() instanceof IResource) {

				final IResource itemSelected= (IResource)selection.getFirstElement();

				/* cannot verify if the user selects something that is not a file */
				if (itemSelected.getType() != IResource.FILE) {
					Rectangle screenSize = verificationShell.getDisplay().getPrimaryMonitor().getBounds();
					verificationShell.setLocation((screenSize.width - verificationShell.getBounds().width) / 2, ((screenSize.height - verificationShell.getBounds().height) / 2) - 100);
					MessageDialog.openError(verificationShell, "error", "You must select a uml model (*.uml) to be verified");
					return null;
				}

				/* cannot verify a file without the .uml extension */
				if (!itemSelected.getFileExtension().equals("uml")) {
					Rectangle screenSize = verificationShell.getDisplay().getPrimaryMonitor().getBounds();
					verificationShell.setLocation((screenSize.width - verificationShell.getBounds().width) / 2, ((screenSize.height - verificationShell.getBounds().height) / 2) - 100);
					MessageDialog.openError(verificationShell, "error", "You must select a uml model (*.uml) to be verified");

					return null;
				}
				
				if (itemSelected.getName().contains("profile")) {
					Rectangle screenSize = verificationShell.getDisplay().getPrimaryMonitor().getBounds();
					verificationShell.setLocation((screenSize.width - verificationShell.getBounds().width) / 2, ((screenSize.height - verificationShell.getBounds().height) / 2) - 100);
					MessageDialog.openError(verificationShell, "error", "Can not verify UML profiles");

					return null;
				}

				/* cannot verify if the profile does not exist within the current project */
				if (!itemSelected.getProject().getFile("DMOSESprofile.profile.uml").exists()) {
					Rectangle screenSize = verificationShell.getDisplay().getPrimaryMonitor().getBounds();
					verificationShell.setLocation((screenSize.width - verificationShell.getBounds().width) / 2, ((screenSize.height - verificationShell.getBounds().height) / 2) - 100);
					MessageDialog.openError(verificationShell, "error", "The project must contain the DMOSES profile to be verified");

					
					return null;
				}


				/* cannot verify if the user has not selected a model checker */
				if (choice.equals("")){
					Rectangle screenSize = verificationShell.getDisplay().getPrimaryMonitor().getBounds();
					verificationShell.setLocation((screenSize.width - verificationShell.getBounds().width) / 2, ((screenSize.height - verificationShell.getBounds().height) / 2) - 100);
					MessageDialog.openError(verificationShell, "error", "A model checker has not been selected");
					return null;
				}



				umlFile = itemSelected;
				currProject = itemSelected.getProject();
			} else {
				currProject = null;
				umlFile = null;
			}



			SaveModelChecker.createDoc(choice, currProject.getLocation().toString());
			IFile requirements = currProject.getFile("Requirements.tl");
			InputStream is = new ByteArrayInputStream("\n ".getBytes());
			try {
				requirements.appendContents(is, 1, null);
				currProject.refreshLocal(IResource.DEPTH_ONE, null);
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}


			try {
				currProject.refreshLocal(IResource.DEPTH_ONE, null);
			} catch (Exception refresh) {
				refresh.printStackTrace();
			}



			/* represents the current project of the user */
			final File originalGenGraph = new File(getFileLoc("Models/genGraph.xmi"));
			final File originalFGraph = new File(getFileLoc("Models/fGraph.xmi"));
			final File originalOptGraph = new File(getFileLoc("Models/optGraph.xmi"));

			final long startGenGraph = originalGenGraph.lastModified();
			final long startFGraph = originalFGraph.lastModified();
			final long startOptGraph = originalOptGraph.lastModified();

			//			out.println("genGraph before transformations: "+ startGenGraph);
			//			out.println("fGraph before transformations: "+startFGraph);
			//			out.println("optGraph before transformations: "+ startOptGraph);
			//			out.println();






			out.println("Performing Verification.");
			final IFolder folder = currProject.getFolder("src-gen");
			/* perform verification */
			final Job job = new Job("Verification") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {

					monitor.beginTask("Performing Verification", 100);

					/* perform the first transformation */
					monitor.subTask("Performing UML to Graph transformation");
					out.println("Performing UML to Graph transformation");
					boolean toGraphStatus = performUMLToGraphTransformation(umlFile, currProject);
					
					if (!toGraphStatus) {
					
						return Status.CANCEL_STATUS;
					}
					
					monitor.worked(15);

					/* perform the second transformation */
					monitor.subTask("Performing flattening transformation");
					out.println("Performing flattening transformation");
					boolean flatteningStatus = performFlatteningTransformation();
					
					if (!flatteningStatus) {
						
						return Status.CANCEL_STATUS;
					}
					
					monitor.worked(15);

					/* perform the third transformation */
					monitor.subTask("Performing optimization transformation");
					out.println("Performing optimization transformation");
					boolean optStatus = performOptimizationTransformation();
					
					if (!optStatus) {
						
						return Status.CANCEL_STATUS;
					}
					
					monitor.worked(15);

					



					String tempPath = currProject.getFolder("src-gen").getLocation().toString();

					monitor.worked(15);


					long endGenGraph = originalGenGraph.lastModified();
					long endFGraph = originalFGraph.lastModified();
					long endOptGraph = originalOptGraph.lastModified();

					//					out.println("genGraph after transformations: "+endGenGraph);
					//					out.println("fGraph after transformations: "+endFGraph);
					//					out.println("optGraph after transformations: "+endOptGraph);


					if (endGenGraph == startGenGraph || endFGraph == startFGraph || startOptGraph == endOptGraph) {
						Display.getDefault().asyncExec(new Runnable() {
							@Override
							public void run() {
								Rectangle screenSize = verificationShell.getDisplay().getPrimaryMonitor().getBounds();
								verificationShell.setLocation((screenSize.width - verificationShell.getBounds().width) / 2, ((screenSize.height - verificationShell.getBounds().height) / 2) - 100);
								MessageDialog.openError(verificationShell, "error", "There is a problem with the models");


							}
						});

						return Status.CANCEL_STATUS;


					}

					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							updateSrcGenFolder(folder);
						}});



					out.println("generating files...");
					monitor.subTask("Generating Files...");
					try {
						runCodeGeneration(tempPath);
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					monitor.worked(40);

					/* refreshes the src-gen folder */
					
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
					try {
						folder.refreshLocal(IResource.DEPTH_ONE, null);
					} catch (Exception e) {
						e.printStackTrace();
					}
						}});

					return Status.OK_STATUS;
				}

			};
			job.setUser(false);

			final Job job2 = new Job("test") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {

					if (job.getResult() != Status.CANCEL_STATUS) {
						Display.getDefault().asyncExec(new Runnable() {
							@Override
							public void run() {
								out.println("Generation complete");
								MyView.getResultsEditor().setText("");

								VerificationOptions	options = new VerificationOptions(folder, verificationShell);
								URI updated = getFileLoc("UpdatedProperties.q");

								if (choice.equals("uppaal")) {
									IFile verify = folder.getFile(options.getSelection());
									IFile contents = folder.getFile("contents.txt");
									//toUrl.getFile
									URI optGraph = getFileLoc("Models/optGraph.xmi");

									try {
										HashMap<String, ArrayList<String>> mapping = mappingNamesFactory.getMapping(optGraph.toURL().getFile().toString());
										
										String updatedLocation = updated.toURL().getFile().toString();
										Conversions conversions = new Conversions();
										conversions.doConversions(mapping, contents, updatedLocation, currProject, "uppaal");

										IFile properties = folder.getFile("properties.q");
										out.println("Running Uppaal...");
										UppaalLauncher.run(verify.getLocation().toString(), properties.getLocation().toString(), currProject);

									} catch (Exception ex) {
										ex.printStackTrace();
									}

								} else if (choice.equals("nusmv")) {
									IFile verify = folder.getFile(options.getSelection());
									IFile contents = folder.getFile("contents.txt");
									URI optGraph = getFileLoc("Models/optGraph.xmi");

									try {
										URI commands = getFileLoc("NuSMV_Commands/commands.txt");
										HashMap<String, ArrayList<String>> mapping = mappingNamesFactory.getMapping(optGraph.toURL().getFile().toString());
										String updatedLocation = updated.toURL().getFile().toString();
										Conversions conversions = new Conversions();
										conversions.doConversions(mapping, contents, updatedLocation, currProject, "nusmv");
										File f = new File(updated);
										InputStream stream = new FileInputStream(f);
										verify.appendContents(stream, 1, null);

										//cear the contents of the current commands file
										File commandFile = new File(commands);
										PrintWriter writer = new PrintWriter(commandFile);
										writer.print("");
										writer.close();

										IFile report = currProject.getFile("report.txt");

										//write a new command file
										BufferedWriter writer2 = new BufferedWriter(new FileWriter(commandFile, false));
										writer2.write("go");
										writer2.newLine();
										writer2.write("check_ctlspec -o " + report.getLocation().toString());
										writer2.newLine();
										writer2.write("quit -x");
										writer2.newLine();
										writer2.flush();
										writer2.close();
										out.println("Running Nusmv...");
										NusmvLauncher.run(verify.getLocation().toString(), currProject, commands);
									} catch (Exception e) {
										e.printStackTrace();
									}


								} else if (choice.equals("spin")) {

									IFile verify = folder.getFile(options.getSelection());
									IFile contents = folder.getFile("contents.txt");
									//toUrl.getFile
									URI optGraph = getFileLoc("Models/optGraph.xmi");

									try {
										HashMap<String, ArrayList<String>> mapping = mappingNamesFactory.getMapping(optGraph.toURL().getFile().toString());
										String updatedLocation = updated.toURL().getFile().toString();
										Conversions conversions = new Conversions();
										conversions.doConversions(mapping, contents, updatedLocation, currProject, "spin");

										File f = new File(updated);
										InputStream stream = new FileInputStream(f);
										
										
										verify.appendContents(stream, 1, null);

										out.println("Running Spin...");
										
										SpinLauncher.run(verify.getLocation().toString(), conversions.getSpinIDs(), currProject); 

									} catch (Exception ex) {
										ex.printStackTrace();
									}


								}  else if (choice.equals("pes")) {
									
									try {
										IFile verify = folder.getFile(options.getSelection());
										IFile contents = folder.getFile("contents.txt");
										
										URI optGraph = getFileLoc("Models/optGraph.xmi");
										HashMap<String, ArrayList<String>> mapping = mappingNamesFactory.getMapping(optGraph.toURL().getFile().toString());
										String updatedLocation = updated.toURL().getFile().toString();
										Conversions conversions = new Conversions();
										conversions.doConversions(mapping, contents, updatedLocation, currProject, "spin");
										
										File f = new File(updated);
										
										PesLauncher.run(verify,f, conversions.getSpinIDs(), currProject);
										
									} catch (Exception ex) {
										ex.printStackTrace();
									}

	
									
									
								}

								out.println("Verification Complete.");
							}});

					}
					return Status.OK_STATUS;
				}

			};
			job2.setUser(false);
			MutexRule rule = new MutexRule();
			job.setRule(rule);
			job2.setRule(rule);
			job.schedule();
			job2.schedule();


		} 


		return null;
	}





	/**
	 * performs the first transformation
	 * 
	 * @param umlFile file to be transformed
	 * @param currProject the current project of the user
	 */
	private boolean performUMLToGraphTransformation(IResource umlFile, IProject currProject) {
		final MessageConsoleStream out = getConsoleWriter();
		
		URI loc = getFileLoc("Models/genGraph.xmi");

		try {
			UML2Graph runner = new UML2Graph();
			runner.loadModels(umlFile.getLocationURI().toString(), 
					currProject.getFile("DMOSESprofile.profile.uml").getLocationURI().toString());
			runner.doUML2Graph(new NullProgressMonitor());
			runner.saveModels(loc.toURL().toString());
			return true;

		} catch (Exception e) {
			out.getConsole().clearConsole();
			out.println("ERROR IN MODEL:");
			Writer writer = new StringWriter();
			PrintWriter printWriter = new PrintWriter(writer);
			e.printStackTrace(printWriter);
			out.println(writer.toString());
			e.printStackTrace();
			return false;
		}

	}
	/**
	 * performs the seond transformation
	 */
	private boolean performFlatteningTransformation() {

		URI genGraph = getFileLoc("Models/genGraph.xmi");
		URI fGraph = getFileLoc("Models/fGraph.xmi");

		final MessageConsoleStream out = getConsoleWriter();


		try {

			HGraphtoFGraph runner = new HGraphtoFGraph();
			runner.loadModels(genGraph.toURL().toString());
			runner.doHGraphtoFGraph(new NullProgressMonitor());
			runner.saveModels(fGraph.toString());
			return true;
		} catch (Exception ex2) {
			out.getConsole().clearConsole();
			out.println("ERROR IN MODEL:");
			Writer writer = new StringWriter();
			PrintWriter printWriter = new PrintWriter(writer);
			ex2.printStackTrace(printWriter);
			out.println(writer.toString());
			ex2.printStackTrace();
			return false;
		}
	}

	/**
	 * performs the third transformation
	 */
	private boolean performOptimizationTransformation() {
	
		final MessageConsoleStream out = getConsoleWriter();

		URI optGraphLoc = getFileLoc("Models/optGraph.xmi");
		URI fGraph = getFileLoc("Models/fGraph.xmi");
		try {

			Graph2OptGraph runner = new Graph2OptGraph();
			runner.loadModels(fGraph.toURL().toString());
			runner.doGraph2OptGraph(new NullProgressMonitor());

			runner.saveModels(optGraphLoc.toString());
			return true;
		} catch (Exception ex) {
			out.getConsole().clearConsole();
			out.println("ERROR IN MODEL:");
			Writer writer = new StringWriter();
			PrintWriter printWriter = new PrintWriter(writer);
			ex.printStackTrace(printWriter);
			out.println(writer.toString());
			ex.printStackTrace();
			return false;
		}
	}

	/**
	 * clears contents of the folder
	 * @param srcGen the src-gen folder
	 */
	private void updateSrcGenFolder(IFolder srcGen) {
		try {

			if (!srcGen.exists()) {
				srcGen.create(IResource.NONE, true, null);
			} else {

				IResource[] list = srcGen.members();

				for (int i = 0; i < list.length; i++) {
					


					if (!list[i].getName().equals("properties.q") && !list[i].getName().equals("contents.txt")) {
						srcGen.getFile(list[i].getName()).delete(true, null);
					}
				}
			}
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

	/**
	 * outputs the results of the code generation to the src-gen folder
	 * 
	 * @param srcGenPath path of src-gen file
	 * @throws MalformedURLException 
	 */
	private void runCodeGeneration(String srcGenPath) throws MalformedURLException {

		String tempChoice = "";

		if (choice.equals("uppaal")) {
			tempChoice= "M2T::UPPAALDis::main FOR model";

		} else if (choice.equalsIgnoreCase("nusmv")) {
			tempChoice= "M2T::NuSMVflat::main FOR model";
		} else if (choice.equalsIgnoreCase("pes")) {
			tempChoice= "M2T::PES::main FOR model";
		} else {
			tempChoice= "M2T::SPINvariable::main FOR model";
		}



		final ArrayList<String> launcherArgs = new ArrayList<String>();

		URI file = getFileLoc("M2T/genModelVariable.mwe2");
		launcherArgs.add(file.toString());

		URI optGraphLoc = getFileLoc("Models/optGraph.xmi");

		//add model path
		launcherArgs.add("-pmodelUri=" +optGraphLoc);

		//add target path
		launcherArgs.add("-pdirSrcGen="+ srcGenPath);
		//"choice::main FOR model"
		launcherArgs.add("-pchoice=" + tempChoice);

		URL metamodelLoc = new URL(getMetamodelUri("GraphMetaM"));//getFileLoc("Models/GraphMetaM.ecore");
		launcherArgs.add("-pmetamodelFile=" + metamodelLoc);

		Mwe2Launcher launcher = new Mwe2Launcher();
		launcher.run(launcherArgs.toArray(new String[0]));






	}
	
	private MessageConsoleStream getConsoleWriter() {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		MessageConsole myConsole = null;
		for (int i = 0; i < existing.length; i++) {
			if ("verification".equals(existing[i].getName())){
				myConsole = (MessageConsole) existing[i];
			}
		}

		if (myConsole == null) {
			myConsole = new MessageConsole("verification", null);
			conMan.addConsoles(new IConsole[]{myConsole});
		}


		return myConsole.newMessageStream();
		
	}
	
	/**
	 * Returns the URI of the given metamodel, parameterized from the property file.
	 * 
	 * @param metamodelName
	 *            the metamodel name
	 * @return the metamodel URI
	 *
	 * @generated
	 */
	protected String getMetamodelUri(String metamodelName) {
		return properties.getProperty("HGraphtoFGraph.metamodels." + metamodelName);
	}
	
	/**
	 * Finds the file in the plug-in. Returns the file URL.
	 * 
	 * @param fileName
	 *            the file name
	 * @return the file URL
	 * @throws IOException
	 *             if the file doesn't exist
	 * 
	 * @generated
	 */
	protected static URL getFileURL(String fileName) throws IOException {
		final URL fileURL;
		if (isEclipseRunning()) {
			URL resourceURL = HGraphtoFGraph.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = HGraphtoFGraph.class.getResource(fileName);
		}
		if (fileURL == null) {
			throw new IOException("'" + fileName + "' not found");
		} else {
			return fileURL;
		}
	}
	
	/**
	 * Tests if eclipse is running.
	 * 
	 * @return <code>true</code> if eclipse is running
	 *
	 * @generated
	 */
	public static boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable exception) {
			// Assume that we aren't running.
		}
		return false;
	}

}
