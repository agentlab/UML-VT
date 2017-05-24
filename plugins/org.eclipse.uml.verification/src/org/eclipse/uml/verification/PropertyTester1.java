package org.eclipse.uml.verification;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.uml.verification.handlers.LoadConfigurations;

public class PropertyTester1 extends PropertyTester{

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {

		LoadConfigurations l = new LoadConfigurations();
		

		if (property.equals("uppaal")) {
			if (!l.getUppaalLocation().equals("")) {
				return true;
			}
		}


		else if (property.equals("spin")) {
			if (!l.getSpinLocation().equals("")) {
				return true;
			}
		}

		else if (property.equals("nusmv")){
			if (!l.getNusmvLocation().equals("")) {
				return true;
			}
		}
		else if (property.equals("pes")) {
			if (!l.getPesLocation().equals("")) {
				return true;
			}
		}



		return false;
	}


}
