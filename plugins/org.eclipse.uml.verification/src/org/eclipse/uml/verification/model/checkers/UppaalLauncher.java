package org.eclipse.uml.verification.model.checkers;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml.verification.handlers.LoadConfigurations;
import org.eclipse.uml.verification.view.MyView;

public class UppaalLauncher {

	public static void run(String fileLocation, String propertiesLocation, IProject currProject) {
			
		final IFile file2 = currProject.getFile("report.txt");

		if (file2.exists()) {
			try { 
				file2.delete(1,null);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}



		String s = null;


		LoadConfigurations configurationsFile = new LoadConfigurations();
		String loc = configurationsFile.getUppaalLocation();
		
	
		
		try {

			Process p = Runtime.getRuntime().exec(loc +" -q -s -u "+fileLocation+" "+ propertiesLocation);
			BufferedReader stdInput = new BufferedReader(new
					InputStreamReader(p.getInputStream()));



			String lines = "";

			while ((s = stdInput.readLine()) != null) {
				lines+=s;
				lines+="\n";
				
			}

			final String finalResults = OutputTranslation.translateUPPAAL(lines);


			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					MyView.getResultsEditor().setText("");
					MyView.getResultsEditor().setText(finalResults);

				}
			});
			
			
			

			byte[] bytes = lines.getBytes();
			InputStream source = new ByteArrayInputStream(bytes);

			try { 
				file2.create(source, IResource.NONE, null);

			} catch (Exception e1) {
				e1.printStackTrace();
				
			}

		}
		catch (Exception e) {
			e.printStackTrace();
			
		}

	}
	

		
	}


