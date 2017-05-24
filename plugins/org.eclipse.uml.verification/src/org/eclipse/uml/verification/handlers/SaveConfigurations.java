package org.eclipse.uml.verification.handlers;
import java.io.File;




import java.net.URI;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;







import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * 
 * @author John
 * The class reads the contents of the configurations page and 
 * stores the results in an xml file called configurations.xml
 */
public class SaveConfigurations {



	/**
	 * creates the xml document based on the parameters provided
	 * @param uppaalLocation the path specified by the user for uppaal
	 * @param spinLocation the path specified by the user for spin
	 * @param nusmvLocation the path specified by the user for nusmv
	 * @param pesLocation the path specified by the user for pes
	 * 
	 * 
	 */
	public static void createDoc(String uppaalLocation, String spinLocation, String nusmvLocation, String pesLocation){
		try {


			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();


			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("locations");
			doc.appendChild(rootElement);


			/* write the location of upaal to the file format: <uppaal> location </upaal> */
			Element uppaal = doc.createElement("uppaal");
			rootElement.appendChild(uppaal);
			uppaal.setTextContent(uppaalLocation);

			/* write the location of spin to the file format: <spin> location </spin> */
			Element spin = doc.createElement("spin");
			rootElement.appendChild(spin);
			spin.setTextContent(spinLocation);

			/* write the location of nusmv to the file format: <nusmv> location </nusmv> */
			Element nusmv = doc.createElement("nusmv");
			rootElement.appendChild(nusmv);
			nusmv.setTextContent(nusmvLocation);

			/* write the location of pes to the file format: <pes> location </pes> */
			Element pes = doc.createElement("pes");
			rootElement.appendChild(pes);
			pes.setTextContent(pesLocation);



			/* write the data to an xml file */
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			DOMSource source = new DOMSource(doc);
			
			/* locate the configurations file and store the newly created xml document there */
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

			StreamResult result = new StreamResult(file);

			transformer.transform(source, result);

		}catch(Exception e){
			e.printStackTrace();
		}


	}

}
