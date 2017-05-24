package org.eclipse.uml.verification.handlers;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * 
 * @author John
 * This class handles the selection of Pes from the plugins dropdown menu
 */
public class PesHandler extends AbstractHandler{


	/**
	 * @param event when the button is clicked:
	 * 
	 * If a path has been specified for Nusmv the plugin will set
	 * Pes as the model checker to perform the verification.  If the path
	 * for Nusmv has not been specified yet, an error message dialog will open
	 * telling the user to first provide a location for Pes.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
	
		final Shell shell2 = new Shell(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), SWT.SHELL_TRIM | SWT.CENTER);

		
		LoadConfigurations r = new LoadConfigurations();
		

		if (r.getPesLocation().equals("")) {
			Rectangle screenSize = shell2.getDisplay().getPrimaryMonitor().getBounds();
			shell2.setLocation((screenSize.width - shell2.getBounds().width) / 2, ((screenSize.height - shell2.getBounds().height) / 2) - 100);
			MessageDialog.openError(shell2, "error", "The path for Pes has not been specified yet.");
			return null;
		}
		
		
		
		
		VerifyHandler.choice= "pes";
		
		
		
		return null;
	}

}
