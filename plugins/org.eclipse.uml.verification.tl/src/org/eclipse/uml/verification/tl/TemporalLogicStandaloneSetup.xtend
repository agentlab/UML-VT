/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.uml.verification.tl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TemporalLogicStandaloneSetup extends TemporalLogicStandaloneSetupGenerated {

	def static void doSetup() {
		new TemporalLogicStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
