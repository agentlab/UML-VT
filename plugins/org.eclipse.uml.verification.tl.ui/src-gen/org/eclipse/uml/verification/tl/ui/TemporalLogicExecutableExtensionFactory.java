/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.uml.verification.tl.ui;

import com.google.inject.Injector;
import org.eclipse.uml.verification.tl.ui.internal.TlActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TemporalLogicExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TlActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TlActivator.getInstance().getInjector(TlActivator.ORG_ECLIPSE_UML_VERIFICATION_TL_TEMPORALLOGIC);
	}
	
}
