package org.eclipse.uml.verification.wizard;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ExamplesPage extends WizardPage {

	private Text text1;
	private Composite container;
	private String selection;

	public ExamplesPage() {
		super("Create The Project");
		setTitle("Create The Project");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);

		Label label1 = new Label(container, SWT.NONE);
		label1.setText("Enter a Project Name.");
		label1.setBounds(0,0,120,50);

		Label label2 = new Label(container, SWT.NONE);
		label2.setText("Choose Example Project");
		label2.setBounds(0,100,130,20);

		final Button option1 = new Button(container, SWT.RADIO);
		option1.setText("Infusion Pump");
		option1.setBounds(25, 130, 120, 40);



		final Button option2 = new Button(container, SWT.RADIO);
		option2.setText("Simple Model");
		option2.setBounds(25, 170, 120, 40);

		text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
		text1.setText("");
		text1.setBounds(130,0,200,20);
		text1.addKeyListener(new KeyListener() {





			@Override
			public void keyPressed(KeyEvent e) {
				if (text1.getText().isEmpty()) {
					setPageComplete(false);

				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				IWorkspaceRoot root = workspace.getRoot();
				if (!text1.getText().isEmpty() && option1.getSelection() || option2.getSelection()) {

					if (root.getProject(text1.getText()).exists()) {
						setPageComplete(false);
					} else {
						setPageComplete(true);
					}
				} else {
					setPageComplete(false);
				}
			}

		});

		option1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selection ="infusion pump";
				if (!text1.getText().isEmpty()) {
					setPageComplete(true);
					
				}

			}
		});

		option2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selection = "simple model";
				if (!text1.getText().isEmpty()) {
					setPageComplete(true);
					
				}

			}
		});

		// required to avoid an error in the system
		setControl(container);
		setPageComplete(false);

	}

	public String getText1() {
		return text1.getText();
	}
	public String getSelection() {
		return selection;
	}
}