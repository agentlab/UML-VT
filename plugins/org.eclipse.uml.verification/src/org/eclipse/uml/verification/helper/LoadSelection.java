package org.eclipse.uml.verification.helper;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class LoadSelection {
	private static long time = -1L;
	private static String mcSelection = "";

	public static String getModelCheckerSelection(String file) {
		File selectionFile = new File(file.replace("model.uml", "Selection.xml"));
		long currentTime = selectionFile.lastModified();
		if (time == currentTime) {
			return mcSelection;
		}
		time = currentTime;

		String[] path = file.split("/");
		if (path.length - 2 < 0) {
			return "";
		}
		String project = path[(path.length - 2)];
		mcSelection = getSelection(project);

		return mcSelection;
	}

	public static String test(URI loc) {
		String project = loc.segments()[(loc.segments().length - 2)];

		return getSelection(project);
	}

	private static String getSelection(String project) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IProject proj = workspace.getRoot().getProject(project);

		IFile file = proj.getFile("Selection.xml");
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file.getContents());

			doc.getDocumentElement().normalize();

			NodeList modelChecker = doc.getElementsByTagName("modelChecker");
			return modelChecker.item(0).getTextContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}
