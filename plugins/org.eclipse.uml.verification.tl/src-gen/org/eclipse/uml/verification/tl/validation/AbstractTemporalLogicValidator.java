/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.uml.verification.tl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractTemporalLogicValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.eclipse.uml.verification.tl.temporalLogic.TemporalLogicPackage.eINSTANCE);
		return result;
	}
	
}