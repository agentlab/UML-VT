package org.eclipse.uml.verification.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;



public class MyView extends ViewPart {
	private static Text RESULTS_PAGE;

	@Override
	public void createPartControl(Composite parent) {
		RESULTS_PAGE = new Text(parent, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL |SWT.H_SCROLL);
	    RESULTS_PAGE.setLayoutData(new GridData(GridData.FILL_BOTH));
	    RESULTS_PAGE.setText("The results of the verification will appear here");
	    RESULTS_PAGE.setEditable(false);
	    				    
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		RESULTS_PAGE.setFocus();
		
	}
	
	public static Text getResultsEditor() {
		return RESULTS_PAGE;
	}
 
}
