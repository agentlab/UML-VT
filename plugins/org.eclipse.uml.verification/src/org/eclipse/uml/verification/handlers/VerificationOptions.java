package org.eclipse.uml.verification.handlers;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

public class VerificationOptions {

	private String selection;

	public VerificationOptions(final IFolder folder, final Shell shell) {

		
				shell.setText("Verification");
				shell.setSize(315, 350);
				final List list = new List(shell, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
				list.setBounds(0, 50, 300, 200);
				Label l = new Label(shell, SWT.NONE);
				l.setText("Choose the system to be verified");
				l.setBounds(0, 0, 200, 40);

				Button verify = new Button(shell, SWT.PUSH);
				Button cancel = new Button(shell, SWT.PUSH);

				verify.setText("verify");
				cancel.setText("cancel");

				verify.setBounds(210, 270, 80, 30);
				cancel.setBounds(130, 270, 80, 30);


				try {
					IResource[] files = folder.members();
					for (int i = 0; i < files.length; i++) {

						if (!files[i].getName().equals("properties.q") && !files[i].getName().equals("contents.txt")) {
							list.add(files[i].getName());
						}


					}
				} catch (Exception e) {
					e.printStackTrace();
				}


				shell.open();
				shell.setVisible(true);


				verify.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {

						int tmp = list.getSelectionIndex();
						selection = list.getItem(tmp);
						shell.close();
						
					}
				});	

				cancel.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {

						shell.close();
					}
				});	




				while (!shell.isDisposed()) {
					if (!shell.getDisplay().readAndDispatch()) {
						shell.getDisplay().sleep();
					}
					}
				}
		




	

	public String getSelection() {
		return selection;
	}
}


