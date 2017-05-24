package org.eclipse.uml.verification.helper;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class Conversions {
	HashMap<String, String> conversions;

	public Conversions() {
		URI loc = getFileLoc("Models/optGraph.xmi");
		this.conversions = mappingNamesFactory.getMapping(loc.toString().substring(6));
	}

	public String replaceName(String name) {
		System.out.println("KEY: " + name + " exists? " + this.conversions.containsKey(name));
		System.out.println("Convert " + name + " to: " + (String) this.conversions.get(name));
		return (String) this.conversions.get(name);
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
