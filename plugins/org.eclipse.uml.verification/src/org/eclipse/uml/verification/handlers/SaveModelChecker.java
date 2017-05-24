package org.eclipse.uml.verification.handlers;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class SaveModelChecker {
	
	public static void createDoc(String selection, String projectLocation) {
		
		

		try {
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		Document doc = docBuilder.newDocument();
		Element modelChecker = doc.createElement("modelChecker");
		doc.appendChild(modelChecker);
		modelChecker.setTextContent(selection);
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		DOMSource source = new DOMSource(doc);
		
		File file = new File(projectLocation+"/Selection.xml");
		
		StreamResult result = new StreamResult(file);
		transformer.transform(source, result);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
