package org.eclipse.uml.verification.model.checkers;

import java.util.ArrayList;
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
	
	/**
	 * Create a HashMap that maps model names into id of the graph
	 * @param file : the file of the graph (xmi)
	 * @return  HashMap<String, String>  = < Name, ID >
	 */
	public static HashMap<String, ArrayList<String>> getMapping(String file) {
		
		
		// Initialize the model
		GraphMetaMPackage.eINSTANCE.eClass();
		    
	    // Register the XMI resource factory
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	    
	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    
		 
		// Get the resource
		Resource resource = resSet.getResource(URI.createFileURI(file), true);

		// Fill the mapping Table 
	    HashMap<String, ArrayList<String>> mappingTable = new HashMap<String,  ArrayList<String>>();
	    
		ModelImpl model = (ModelImpl) resource.getContents().get(0);
		for (Iterator<Graph> graphIter = model.getGraph().iterator(); graphIter.hasNext();) {
			Graph graph = (Graph) graphIter.next();
			
			for (Iterator<Vertex> vertexIter = graph.getVertex().iterator(); vertexIter.hasNext();) {
				Vertex vertex = (Vertex) vertexIter.next();
				
				String[] singleName = vertex.getName().split(";");
				
				for (int i = 0; i < singleName.length; i++) {
					
					ArrayList<String> value = new  ArrayList<String>();
					value.add(vertex.getRName());
					value.add(String.valueOf(vertex.getIncoming().size()));
					
					mappingTable.put(graph.getName()+"::"+singleName[i],value);
					
					
					
				}
			}
		}
		return mappingTable;
	}
		 

}

