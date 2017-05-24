package org.eclipse.uml.verification.wizard;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.osgi.framework.Bundle;

public class MyWizard extends Wizard implements INewWizard {
	protected PageOne creationPage;

	public MyWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "UML Verification Project Wizard";
	}

	@Override
	public void addPages() {
		creationPage = new PageOne();
		addPage(creationPage);
	}


	@Override
	public boolean performFinish() {

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject project  = root.getProject(creationPage.getText1());
		//IFile perfusor = project.getFile("PerfusorVerified.uml");
		IFile profile = project.getFile("DMOSESprofile.profile.uml");
		IFile model = project.getFile("model.uml");
		IFile di = project.getFile("model.di");
		IFile notation = project.getFile("model.notation");
		IFile selection = project.getFile("Selection.xml");
		IFile profile2 = project.getFile("DMOSESprofile.Deterministic_Behavior.profile.uml");
		IFile profile3 = project.getFile("DMOSESprofile.Hardware_Management.profile.uml");
		
		IFile requirements = project.getFile("Requirements.tl");

		//File f = new File(getFileLoc("wizard_items/PerfusorVerified.uml"));
		File f2 = new File(getFileLoc("wizard_items/DMOSESprofile.profile.uml"));
		File f3 = new File(getFileLoc("wizard_items/Requirements.tl"));
		File f4 = new File(getFileLoc("wizard_items/model.di"));
		File f5 = new File(getFileLoc("wizard_items/model.notation"));
		File f6 = new File(getFileLoc("wizard_items/model.uml"));
		File f7 = new File(getFileLoc("wizard_items/Selection.xml"));
		File f8 = new File(getFileLoc("wizard_items/DMOSESprofile.Deterministic_Behavior.profile.uml"));
		File f9 = new File(getFileLoc("wizard_items/DMOSESprofile.Hardware_Management.profile.uml"));

		try {
			if (!project.exists()) {
				project.create(null);
			}
			if (!project.isOpen()){
				project.open(null);
			}

			IProjectDescription description = project.getDescription();
			description.setNatureIds(new String[] { "org.eclipse.xtext.ui.shared.xtextNature" });
			project.setDescription(description, null);
			
			
			


			//InputStream targetStream = new FileInputStream(f);
			InputStream targetStream2 = new FileInputStream(f2);
			InputStream targetStream3 = new FileInputStream(f3);
			InputStream targetStream4 = new FileInputStream(f4);
			InputStream targetStream5 = new FileInputStream(f5);
			InputStream targetStream6 = new FileInputStream(f6);
			InputStream targetStream7 = new FileInputStream(f7);
			InputStream targetStream8 = new FileInputStream(f8);
			InputStream targetStream9 = new FileInputStream(f9);
			
			
			profile.create(targetStream2, IResource.NONE, null);
			profile2.create(targetStream8, IResource.NONE, null);
			profile3.create(targetStream9, IResource.NONE, null);
			
			requirements.create(targetStream3, IResource.NONE, null);
			model.create(targetStream6, IResource.NONE, null);
			
			String importLoc = "import \""+project.getFile("model.uml").getLocation().toString()+"\"";
			
			
			InputStream stream = new ByteArrayInputStream(importLoc.getBytes());
			requirements.appendContents(stream, 1, null);
			
			
			
			di.create(targetStream4, IResource.NONE, null);
			notation.create(targetStream5, IResource.NONE, null);
			
			selection.create(targetStream7, IResource.NONE, null);


		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {


	}

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


}
