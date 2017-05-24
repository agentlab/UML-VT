package org.eclipse.uml.verification.helper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.uml.util.OCLUMLUtil;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

public class ElementName {
	private static long time = -1L;
	private static List<String> nameLst = new ArrayList<String>();

	public static List<String> getList(String modelFile) {
		File file = new File(modelFile);
		long currentTime = file.lastModified();
		if (time == currentTime) {
			return nameLst;
		}
		time = currentTime;
		nameLst.clear();

		Model model = getModel(modelFile);

		EList<Element> typeLst = model.allOwnedElements();

		for (Iterator<Element> iterator = typeLst.iterator(); iterator.hasNext();) {
			Element element = (Element) iterator.next();
			if ((getType(element).contains("Activity")) && (!getType(element).toLowerCase().contains("parameter"))) {
				nameLst.addAll(getNodesNames((Activity) element, getName(element) + "::"));
			}
		}
		//for (Iterator iterator = nameLst.iterator(); iterator.hasNext();) {
		//  ((String)iterator.next());
		//}
		return nameLst;
	}

	private static List<String> getNodesNames(Activity activity, String prefix) {
		List<String> nameLst = new ArrayList<String>();
		for (Iterator<ActivityNode> iterator = activity.getNodes().iterator(); iterator.hasNext();) {
			ActivityNode activitynode = (ActivityNode) iterator.next();
			if (getType(activitynode).contains("Action")) {
				nameLst.add(prefix + getName(activitynode));
			}
			if (getType(activitynode).contains("CallBehaviorAction")) {
				Activity behavior = (Activity) ((CallBehaviorAction) activitynode).getBehavior();
				if (behavior != null) {
					String[] prefixes = prefix.split("::");
					for (int i = 0; i < prefixes.length; i++) {
						if (prefixes[i].equals(behavior)) {
							System.err.println("The model has recursive calls of " + getName(behavior) + " in "
									+ getName(activity));
							System.exit(1);
						}
					}
					nameLst.add(prefix + getName(activitynode));
					nameLst.addAll(getNodesNames(behavior, getName(activity) + "::" + getName(activitynode) + "::"));
				}
			}
		}
		return nameLst;
	}

	private static Model getModel(String file) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml", UMLResource.Factory.INSTANCE);
		resourceSet.getPackageRegistry().put("http://www.eclipse.org/uml2/5.0.0/UML", UMLPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put("http://www.eclipse.org/emf/2002/Ecore", EcorePackage.eINSTANCE);

		UMLResourcesUtil.init(resourceSet);

		Resource resource = resourceSet.getResource(URI.createFileURI(file), true);
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Model model = (Model) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.MODEL);
		if (model == null) {
			System.err.println("Model: load failed!");
			System.exit(1);
		}
		return model;
	}

	private static String getType(Element element) {
		return OCLUMLUtil.getMetaclass(element).getName();
	}

	private static String getName(Element element) {
		return ((NamedElement) element).getName();
	}

	public static String getLocation() {
		IWorkbenchPart workbenchPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActivePart();

		IFile file = (IFile) workbenchPart.getSite().getPage().getActiveEditor().getEditorInput()
				.getAdapter(IFile.class);

		IProject proj = (IProject) file.getParent();

		String loc = "";
		try {
			for (IResource i : proj.members()) {
				if (i.getName().equals("model.uml")) {
					IFile model = (IFile) i;
					return model.getLocation().toString();
				}
			}
		} catch (Exception localException) {
		}
		return "model does not exist";
	}
}
