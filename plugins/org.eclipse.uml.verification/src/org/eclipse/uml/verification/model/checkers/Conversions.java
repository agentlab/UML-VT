package org.eclipse.uml.verification.model.checkers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;

public class Conversions {
	
	private  ArrayList<String> spinIDs;
	
	public Conversions() {
		spinIDs = new ArrayList<String>();
	}

	/**
	 * 
	 * @param converter the map that converts between id's and names
	 * @param contents the contents.txt file (helper file)
	 * @param saveLocation
	 * @param proj is the current project
	 */
	public void doConversions(HashMap<String, ArrayList<String>> converter, IFile contents, String saveLocation, IProject proj, String modelChecker) {

		ArrayList<String> helperContents = new ArrayList<String>();
		ArrayList<String> results = new ArrayList<String>();



		try {

			BufferedReader contentsReader = new BufferedReader(new InputStreamReader(contents.getContents()));

			String lines1 = "";

			
			while ((lines1 = contentsReader.readLine()) != null) {
				if (goodLine(lines1)) {
				helperContents.add(lines1);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}


	
		for (int i =0; i < helperContents.size(); i++) {
			String resultsLine = helperContents.get(i);

			//create a string that only represents the replacements separated by ";"
			String replacements = resultsLine.substring(resultsLine.indexOf(";") + 1, resultsLine.length());

			//get each segment that is separated by the ";"
			String[] segments = replacements.split(";");
			
			int idx = 0;
			boolean flag = true;
			
			while (resultsLine.contains("xxxxx")) {
				if (converter.get(segments[idx] ) != null) {
					resultsLine = resultsLine.replaceFirst("xxxxx", converter.get(segments[idx++]).get(0));

				} else {
					//there is no conversion
					resultsLine = resultsLine.replaceFirst("xxxxx", "");
					flag = false;
				}
				
			}
			
			//flag guarantees 
			if (flag && resultsLine.contains("yyyyy")) {
				
				Object x =converter.get(segments[idx]);
				resultsLine = resultsLine.replaceFirst("yyyyy", converter.get(segments[idx]).get(1));
				spinIDs.add(converter.get(segments[idx++]).get(0));
			}


			
			if (flag) {
				//extract the updated part without the semi colons
				resultsLine = resultsLine.substring(0, resultsLine.indexOf(";"));
				
				results.add(resultsLine);
			}

		}



	
		try {
			File updatedProperties = new File(saveLocation);

			PrintWriter pw = new PrintWriter(updatedProperties);
			pw.print("");
			pw.close();
			

			BufferedWriter writer = new BufferedWriter(new FileWriter(updatedProperties, false));



			for (int j = 0; j < results.size(); j++) {

				writer.write(results.get(j));
				writer.newLine();
			}
			writer.flush();
			writer.close();


			if (modelChecker.equals("uppaal")) {

				InputStream targetStream = new FileInputStream(updatedProperties);

				IFile properties = proj.getFolder("src-gen").getFile("properties.q");

				if (!properties.exists()) {
					properties.create(targetStream, IResource.NONE, null);
				} else {
					properties.delete(false, null);
					properties.create(targetStream, IResource.NONE, null);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	private static boolean goodLine(String s) {
		
		if (s.charAt(0) == ' ' || s.charAt(0) == '\n') {
			return false;
		} else {
			return true;
		}
	}
	
	public ArrayList<String> getSpinIDs(){
		return spinIDs;
	}
}
