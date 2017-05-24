package org.eclipse.uml.verification.handlers;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.io.File;
import java.net.URI;
import java.net.URL;


/**
 * This class is used to read the contents of the configurations file
 * @author John
 */
public class LoadConfigurations {
	
	private String uppaalLocation, spinLocation, nusmvLocation, pesLocation;
	
	public LoadConfigurations(){
		uppaalLocation = null;
		spinLocation= null;
		nusmvLocation = null;
		pesLocation= null;
		extractData();
		
	}
	
	/**
	 * 
	 * @return the path of the configurations file
	 */
	private String getConfigurationsFilePath() {
		
		Bundle bundle = Platform.getBundle("org.eclipse.uml.verification");

		URL fileURL = bundle.getEntry("configurations.xml");
		File file = null;
		try {
			URL resolvedFileURL = FileLocator.toFileURL(fileURL);


			URI resolvedURI = new URI(resolvedFileURL.getProtocol(), resolvedFileURL.getPath(), null);


			file = new File(resolvedURI);
		} catch (Exception e1) {

			e1.printStackTrace();
		} 
		
		return file.getPath();

	}
	
	
	/**
	 * reads the data from the configurations file
	 */
	private void extractData(){
		
		try{
		File myFile = new File(getConfigurationsFilePath());
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(myFile);
	 
		doc.getDocumentElement().normalize();
		
		/* get uppaal location */
		NodeList uppaalNodeList = doc.getElementsByTagName("uppaal");
		uppaalLocation = uppaalNodeList.item(0).getTextContent();
		
		/* get spin location */
		NodeList spinNodeList = doc.getElementsByTagName("spin");
		spinLocation = spinNodeList.item(0).getTextContent();
		
		/* get nusmv location */
		NodeList nusmvNodeList = doc.getElementsByTagName("nusmv");
		nusmvLocation = nusmvNodeList.item(0).getTextContent();
		
		/* get pes location */
		NodeList pesNodeList = doc.getElementsByTagName("pes");
		pesLocation = pesNodeList.item(0).getTextContent();
	
		}catch(Exception e){
			
		}

	}
	
	/**
	 * 
	 * @return the location of uppaal
	 */
	public String getUppaalLocation(){
		return uppaalLocation;
	}
	/**
	 * 
	 * @return the location of spin
	 */
	public String getSpinLocation(){
		return spinLocation;
	}
	/**
	 * 
	 * @return the location of nusmv
	 */
	public String getNusmvLocation(){
		return nusmvLocation;
	}
	/**
	 * 
	 * @return the location of pes
	 */
	public String getPesLocation(){
		return pesLocation;
	}

}

