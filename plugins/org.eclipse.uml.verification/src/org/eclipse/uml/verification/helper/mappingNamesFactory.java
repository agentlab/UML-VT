package org.eclipse.uml.verification.helper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import GraphMetaM.Graph;
import GraphMetaM.GraphMetaMPackage;
import GraphMetaM.Vertex;
import GraphMetaM.impl.ModelImpl;

public class mappingNamesFactory {
	public static HashMap<String, String> getMapping(String file) {
		GraphMetaMPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.getResource(URI.createFileURI(file), true);

		HashMap<String, String> mappingTable = new HashMap<String, String>();

		ModelImpl model = (ModelImpl) resource.getContents().get(0);
		Iterator<Vertex> vertexIter;
		for (Iterator<Graph> graphIter = model.getGraph().iterator(); graphIter.hasNext(); vertexIter.hasNext()) {
			Graph graph = (Graph) graphIter.next();

			vertexIter = graph.getVertex().iterator(); // continue;
			Vertex vertex = (Vertex) vertexIter.next();

			String[] singleName = vertex.getName().split(":");
			for (int i = 0; i < singleName.length; i++) {
				System.out.println(
						graph.getName() + "::" + singleName[i].replaceAll(";", ":") + "    " + vertex.getRName());

				mappingTable.put(graph.getName() + "::" + singleName[i].replaceAll(";", ":"), vertex.getRName());
			}
		}
		return mappingTable;
	}
}
