package org.eclipse.uml.verification.model.checkers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml.verification.handlers.LoadConfigurations;
import org.eclipse.uml.verification.view.MyView;

public class NusmvLauncher {


	public static void run(String fileLocation, IProject currProject, URI commandsLoc) {

		LoadConfigurations configurationsFile = new LoadConfigurations();
		String loc = configurationsFile.getNusmvLocation();
		



		try {

			String commandLoc = commandsLoc.toURL().getFile().toString();
			//this removes leading front slash to create a valid location
			commandLoc = commandLoc.substring(1);
		
			Process p = Runtime.getRuntime().exec(loc +" -source "+commandLoc+" "+fileLocation);
			p.waitFor();
			
			IFile resultsFile = currProject.getFile("report.txt");
			
			resultsFile.refreshLocal(IResource.DEPTH_ONE, null);
			
			
			
			

			BufferedReader reader = new BufferedReader(new InputStreamReader(resultsFile.getContents()));
			StringBuilder sb = new StringBuilder();
			String s = null;
			while ((s = reader.readLine()) != null) {
				sb.append(s+"\n");
				
				
			}
			reader.close();

			final String finalResults = OutputTranslation.translateNuSMV(sb.toString());


			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					MyView.getResultsEditor().setText("");
					MyView.getResultsEditor().setText(finalResults);

				}
			});

		}
		catch (Exception e) {

			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));

			e.printStackTrace();

		}

	}


}

