package org.eclipse.uml.verification.model.checkers;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml.verification.handlers.LoadConfigurations;
import org.eclipse.uml.verification.view.MyView;

public class PesLauncher {
	
	public static Integer formulaNumber = 0;
	
	public static void run(IFile inputPes, File content, ArrayList<String> spinIDs, IProject currProject) {
		
		
		// Add formulas to the input file
		addFormula(inputPes, content);
		
		String fileToVerifyLoc = inputPes.getLocation().toString();
		
		final IFile report = currProject.getFile("report.txt");

		if (report.exists()) {
			try { 
				report.delete(1,null);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}


		LoadConfigurations configurationsFile = new LoadConfigurations();
		String PesLoc = configurationsFile.getPesLocation();

		
		String directory = "";
		String executable = "";
		
		/* process for windows */
/*		if (originalLoc.contains("\\")) {
			
			directory = originalLoc.substring(0, originalLoc.lastIndexOf("\\"));
			executable = originalLoc.substring( originalLoc.lastIndexOf("\\") + 1, originalLoc.length());
			
		} else {*/
			/*process for macs */
			
	/*		directory = originalLoc.substring(0, originalLoc.lastIndexOf("/"));
			executable = originalLoc.substring( originalLoc.lastIndexOf("/") + 1, originalLoc.length());
			
		}*/

		try {

			
			
			String lines = "";
			ProcessBuilder pb3;
			Process p3 = null;
			BufferedReader br1 = null;
			
			InputStream pesStream = inputPes.getContents();
			StringWriter writer = new StringWriter();
			IOUtils.copy(pesStream, writer);
			String pesFile = writer.toString();
	

			for (int i = 0; i < formulaNumber; i++) {
				
				
				
				byte[] bytes = (pesFile.replace("START: X", "START: X"+i)).getBytes();
				InputStream perFormulaStream = new ByteArrayInputStream(bytes);
				inputPes.setContents(perFormulaStream, true, true, null);
				
				p3 = Runtime.getRuntime().exec(PesLoc + " " + fileToVerifyLoc);
			//	BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

				
				
			/*		if (directory.contains("\\")) {
					pb3 = new ProcessBuilder("CMD", "/C", executable, fileToVerifyLoc);
					pb3.directory(new File(directory));
					p3 = pb3.start();
				} 
				else {
					pb3 =  new ProcessBuilder("./" + executable, fileToVerifyLoc);
					pb3.directory(new File(directory));
					
					p3 = pb3.start();
				}*/
				
				br1 = new BufferedReader(new InputStreamReader(p3.getInputStream()));
				String line = null;
				while ((line = br1.readLine()) != null)
				{
					lines += line;
					lines+="\n";
				}
			}

				
				final String finalResults = lines;
				
				byte[] bytes = finalResults.getBytes();
				InputStream source = new ByteArrayInputStream(bytes);

				try { 
					report.create(source, IResource.NONE, null);

				} catch (Exception e1) {
					e1.printStackTrace();
					
				}

				
				final String finalResultsView = OutputTranslation.translatePES(lines);


				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {

						MyView.getResultsEditor().append(finalResultsView.toString());

					}
				});








		} catch (Exception e) {
			e.printStackTrace();

		}
		
		
		
		
	
	}
	private static void addFormula(IFile inputPes, File content)
	{
		try {	
				
				// Extracting text of the input of PES files
				InputStream pesStream = inputPes.getContents();
				StringWriter writer = new StringWriter();
				IOUtils.copy(pesStream, writer);
				String[] pesFile = writer.toString().split("INVARIANT:");
				pesFile[1] = "INVARIANT:" + pesFile[1]; 
	
				// Creating the formulas
				
				//This function set the formulaNumber too
				String pesFormula = getFormula(content);
				
				String predicate = "";
				for (int i = 0; i < formulaNumber; i++) {
					predicate = predicate + ", X" +i;	
				}
				
				if (predicate.startsWith(", "))
					predicate = predicate.substring(1);
				
				String formula = "PREDICATE:{ "+ predicate + "} \n"
						+ "START: X \n"
						+ "EQUATIONS:{ \n"
						+  pesFormula + "\n"
						+ "} \n";
				
				// Adding formulas to the input of PES files
				String pesFormulaFile = pesFile[0] + formula + "\n \n" +pesFile[1];
				byte[] bytes = pesFormulaFile.getBytes();
				InputStream perFormulaStream = new ByteArrayInputStream(bytes);
				inputPes.setContents(perFormulaStream, true, true, null);
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		
	}
	
	
	
	private static String getFormula(File content )
	{
		String formula = "";
		formulaNumber = 0; 
		
		// Extracting text from the formula
		try {
			Scanner input = new Scanner(content);
			
			while (input.hasNextLine())
			{
				formula = formula + input.nextLine() +"\n";
				formulaNumber++;
				
			}
			
			input.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return formula;	
	}



}
