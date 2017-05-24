package org.eclipse.uml.verification.model.checkers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OutputTranslation {
	
	public static String translateUPPAAL(String output) {
		List<String> genOutput = new ArrayList<String>();
		
		String[] properties = output.split("Verifying property");
		
		
		for (int i = 0; i < properties.length; i++) {
			
			if (properties[i].contains("Property is satisfied"))
				genOutput.add("Property " + (genOutput.size()+1) + " is satisfied");
					
			else if (properties[i].contains("Property is NOT satisfied"))
				genOutput.add("Property " + (genOutput.size()+1) + " is NOT satisfied");
			
		}
				
		return addResultHeader(List2String(genOutput));
		
	}
	
	public static String translateSPIN(String output) {
		List<String> genOutput = new ArrayList<String>();
		
		String[] properties = output.split("pan: ltl formula");
		
		
		for (int i = 0; i < properties.length; i++) {
			
			if (properties[i].contains("assertion violated") || 
				properties[i].contains("acceptance cycle") 	)
				genOutput.add("Property " + (genOutput.size()+1) + " is NOT satisfied");
			else if (properties[i].contains("unreached in claim"))
				genOutput.add("Property " + (genOutput.size()+1) + " is  satisfied");
			
		}
				
		return addResultHeader(List2String(genOutput));
		
	}
	
	public static String translatePES(String output) {
		List<String> genOutput = new ArrayList<String>();
		
		String[] properties = output.split("====Begin Program Input");
		
		
		for (int i = 0; i < properties.length; i++) {
			
			if (properties[i].contains("The timed automaton does not satisfy the MES"))
				genOutput.add("Property " + (genOutput.size()+1) + " is NOT satisfied");
			else if (properties[i].contains("The timed automaton satisfies the MES"))
				genOutput.add("Property " + (genOutput.size()+1) + " is  satisfied");
			
		}
				
		return addResultHeader(List2String(genOutput));
		
	}

	public static String translateNuSMV(String output) {
		List<String> genOutput = new ArrayList<String>();
		
		String[] properties = output.split("-- specification");
		
		
		for (int i = 0; i < properties.length; i++) {
			
			if (properties[i].contains("false"))
				genOutput.add("Property " + (genOutput.size()+1) + " is NOT satisfied");
			else if (properties[i].contains("true"))
				genOutput.add("Property " + (genOutput.size()+1) + " is  satisfied");
			
		}
				
		return addResultHeader(List2String(genOutput));
		
	}
	
	private static String  List2String (List<String> list)
	{
		String output = "";
		
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String line = (String) iterator.next();
			
			output = output + line + "\n" + "\n";
			
		}
		
		return output;
		
	}
	
	
	private static String addResultHeader (String result)
	{
		
		String header = 
				"******************************************* \n" +
			    " Result of the formal verification           \n" +
			    " Model checker specific output is saved  \n" +
			    " in the report.txt				  \n" +
			    "******************************************* \n \n";
				
		return header + result ;
		
		
	}
	
}
