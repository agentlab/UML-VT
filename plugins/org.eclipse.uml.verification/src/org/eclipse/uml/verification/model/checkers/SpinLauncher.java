package org.eclipse.uml.verification.model.checkers;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml.verification.handlers.LoadConfigurations;
import org.eclipse.uml.verification.view.MyView;

public class SpinLauncher {

	public static void run(String fileToVerifyLoc, ArrayList<String> spinIDs, IProject currProject) {
		/*
		 *  spin.exe  -a #.pml
		 *	gcc -o pan pan.c
		 *	pan -a -N
		 */

		final IFile report = currProject.getFile("report.txt");

		if (report.exists()) {
			try { 
				report.delete(1,null);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}


		LoadConfigurations configurationsFile = new LoadConfigurations();
		String originalLoc = configurationsFile.getSpinLocation();

		
		String directory = "";
		String executable = "";
		String harddrive ="/";
		
		/* process for windows */
		if (originalLoc.contains("\\")) {
			
			directory = originalLoc.substring(0, originalLoc.lastIndexOf("\\"));
			executable = originalLoc.substring( originalLoc.lastIndexOf("\\") + 1, originalLoc.length());
			harddrive =  harddrive + directory.substring(0, directory.indexOf(":\\"));
			
		} else {
			/*process for macs */
			
			directory = originalLoc.substring(0, originalLoc.lastIndexOf("/"));
			executable = originalLoc.substring( originalLoc.lastIndexOf("/") + 1, originalLoc.length());
			
		}
		
		
		try {

			if (directory.contains("\\")) {
				//for windows
		//	ProcessBuilder pb1 = new ProcessBuilder("CMD", harddrive, executable, "-a", fileToVerifyLoc);
			ProcessBuilder pb1 = new ProcessBuilder("CMD", "/C", executable, "-a", fileToVerifyLoc);
			
			
			pb1.directory(new File(directory));
			Process process1 = pb1.start();
			process1.waitFor();
			} else {
				// for macs
				
				ProcessBuilder pb1 = new ProcessBuilder(directory+"/" + executable, "-a", fileToVerifyLoc);
				pb1.directory(new File(directory));
				Process process1 = pb1.start();
				process1.waitFor();
				
			}
			
	
			ProcessBuilder pb = new ProcessBuilder("gcc", "-o", "pan", "pan.c");
			pb.directory(new File(directory));
			Process process2 = pb.start();
			process2.waitFor();
			
			
			
			String lines = "";
			ProcessBuilder pb3;
			Process p3 = null;
			BufferedReader br1 = null;

			for (int i = 0; i < spinIDs.size(); i++) {
				
				
				if (directory.contains("\\")) {
					String curr = "-NF"+i;
				    pb3 = new ProcessBuilder("CMD", "/C", "pan", "-a", curr);
					pb3.directory(new File(directory));
					p3 = pb3.start();
				} 
				else {
					String curr = "-NF"+i;
					pb3 =  new ProcessBuilder(directory +"/pan", "-a", curr);
					pb3.directory(new File(directory));
					
					p3 = pb3.start();
				}
				
				br1 = new BufferedReader(new InputStreamReader(p3.getInputStream()));
				String line = null;
				while ((line = br1.readLine()) != null)
				{
					lines += line;
					lines+="\n";
				}
			}

			
			try {
				
				
				final String finalResults = lines;
				
				byte[] bytes = finalResults.getBytes();
				InputStream source = new ByteArrayInputStream(bytes);

				try { 
					report.create(source, IResource.NONE, null);

				} catch (Exception e1) {
					e1.printStackTrace();
					
				}

				
				final String finalResultsView = OutputTranslation.translateSPIN(lines);


				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {

						MyView.getResultsEditor().append(finalResultsView.toString());

					}
				});


			} finally {
				br1.close();
			}







		} catch (Exception e) {
			e.printStackTrace();

		}


		}
}

