package org.eclipse.uml.verification.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class PropertiesView extends ViewPart {
	private static Text Properties_PAGE;

	@Override
	public void createPartControl(Composite parent) {
		Properties_PAGE = new Text(parent, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL |SWT.H_SCROLL);
		Properties_PAGE.setLayoutData(new GridData(GridData.FILL_BOTH));
		Properties_PAGE.setText("The model-specific properties being tested will appear here");
		Properties_PAGE.setEditable(false);
	    				    
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	public static Text getPropertiesEditor() {
		return Properties_PAGE;
	}
 
}

