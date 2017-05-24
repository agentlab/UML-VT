package org.eclipse.uml.verification.handlers;



import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * 
 * @author John
 * This class handles the selection of Spin from the plugins dropdown menu
 */
public class SpinHandler extends AbstractHandler{

	/**
	 * @param event when the button is clicked:
	 * 
	 * If a path has been specified for Nusmv the plugin will set
	 * Pes as the model checker to perform the verification.  If the path
	 * for Spin has not been specified yet, an error message dialog will open
	 * telling the user to first provide a location for Spin.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		VerifyHandler.choice= "spin";
		
		return null;
	}

}
