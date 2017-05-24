package org.eclipse.uml.verification.handlers;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.handlers.HandlerUtil;


/**
 * This class Handles the configurations page of the plugin.  It allows the User
 * to specify the working paths of the model checkers
 * 
 * 
 * @author John
 *
 */
public class ConfigurationsHandler extends AbstractHandler {
	

	/**
	 *  
	 * process the users requests
	 * @param event when the configurations page is opened
	 *
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		

		String upaalLocation;
		String spinLocation;
		String nusmvLocation;
		String pesLocation;

		LoadConfigurations conf = new LoadConfigurations();

		upaalLocation = conf.getUppaalLocation();
		spinLocation = conf.getSpinLocation();
		nusmvLocation = conf.getNusmvLocation();
		pesLocation = conf.getPesLocation();

		final Shell configurationsWindow = new Shell(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), SWT.SHELL_TRIM | SWT.CENTER);
		Rectangle screenSize = configurationsWindow.getDisplay().getPrimaryMonitor().getBounds();
		configurationsWindow.setLocation((screenSize.width - configurationsWindow.getBounds().width) / 2, ((screenSize.height - configurationsWindow.getBounds().height) / 2) - 100);


		Label configurationsLabel = new Label(configurationsWindow, SWT.NONE);
		configurationsLabel.setText("Plug-in Configurations: ");
		configurationsLabel.setBounds(0, 0, 330, 30);


		/* places the uppaal configurations on the page */
		Label uppaalLabel = new Label(configurationsWindow, SWT.NONE);                      
		uppaalLabel.setText("UPPAAL");
		uppaalLabel.setBounds(5,70,100,30);
		final Text uppaalTextField = new Text(configurationsWindow, SWT.SINGLE | SWT.BORDER);    
		if (upaalLocation != null){
			uppaalTextField.setText(upaalLocation);
		}
		uppaalTextField.setBounds(100, 100, 300, 28);

		Label chooseLocationLabel1 = new Label(configurationsWindow, SWT.BORDER);                       
		chooseLocationLabel1.setText("Choose Location");
		chooseLocationLabel1.setBounds(0,100,100,30);
		Button browseButton1 = new Button(configurationsWindow, SWT.PUSH);                    
		browseButton1.setText("Browse");
		browseButton1.setBounds(400, 99, 100, 30);


		/* places the spin configurations on the page */
		Label spinLabel = new Label(configurationsWindow, SWT.NONE);                      
		spinLabel.setText("SPIN");
		spinLabel.setBounds(5,190,100,30);
		final Text spinTextField = new Text(configurationsWindow, SWT.SINGLE | SWT.BORDER);    
		spinTextField.setBounds(100, 220, 300, 28);
		if (spinLocation != null){
			spinTextField.setText(spinLocation);
		}

		Label chooseLocationLabel2 = new Label(configurationsWindow, SWT.BORDER);                       
		chooseLocationLabel2.setText("Choose Location");
		chooseLocationLabel2.setBounds(0,220,100,30);
		Button browseButton2 = new Button(configurationsWindow, SWT.PUSH);                   
		browseButton2.setText("Browse");
		browseButton2.setBounds(400, 219, 100, 30);



		/* places the nusmv configurations on the page */
		Label nusmvLabel = new Label(configurationsWindow, SWT.NONE);                     
		nusmvLabel.setText("NUSMV");
		nusmvLabel.setBounds(5,310,100,30);
		final Text nusmvTextField = new Text(configurationsWindow, SWT.SINGLE | SWT.BORDER);    
		nusmvTextField.setBounds(100, 340, 300, 28);
		if (nusmvLocation != null){
			nusmvTextField.setText(nusmvLocation);
		}
		Label chooseLocationLabel3 = new Label(configurationsWindow, SWT.BORDER);                       
		chooseLocationLabel3.setText("Choose Location");
		chooseLocationLabel3.setBounds(0,340,100,30);
		Button browseButton3 = new Button(configurationsWindow, SWT.PUSH);                   
		browseButton3.setText("Browse");
		browseButton3.setBounds(400, 339, 100, 30);


		/* places the pes configurations on the page */
		Label pesLabel = new Label(configurationsWindow, SWT.NONE);                     
		pesLabel.setText("PES");
		pesLabel.setBounds(5,430,100,30);
		final Text pesTextField = new Text(configurationsWindow, SWT.SINGLE | SWT.BORDER);    
		pesTextField.setBounds(100, 460, 300, 28);
		if (pesLocation != null){
			pesTextField.setText(pesLocation);
		}
		Label chooseLocationLabel4 = new Label(configurationsWindow, SWT.BORDER);                      
		chooseLocationLabel4.setText("Choose Location");
		chooseLocationLabel4.setBounds(0,460,100,30);
		Button broseButton4 = new Button(configurationsWindow, SWT.PUSH);                    
		broseButton4.setText("Browse");
		broseButton4.setBounds(400, 459, 100, 30);


		/* creates borders for readability */
		int tempY = 40, xBound = 600, yBound = 120;               
		for (int i = 0; i < 4; i++){
			Label border = new Label(configurationsWindow, SWT.BORDER);
			border.setBounds(0, tempY, xBound, yBound);
			tempY+=120;
		}

		/* create the save button */
		Button saveButton = new Button(configurationsWindow, SWT.PUSH);
		saveButton.setText("Save");
		saveButton.setBounds(400, 520, 100, 30);

		/* create the cancel button */
		Button cancelButton = new Button(configurationsWindow, SWT.PUSH);
		cancelButton.setText("Cancel");
		cancelButton.setBounds(300, 520, 100, 30);




		/* cancel button handler, close the window when cancel is pressed */
		cancelButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				configurationsWindow.close();
			}
		});





		/* this handles the file browser for uppaal */
		browseButton1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				try {

					 	FileDialog fd = new FileDialog(configurationsWindow, SWT.OPEN);
				        fd.setText("Open");
				        String[] filterExt = { "*.*" };
				        fd.setFilterExtensions(filterExt);
				        uppaalTextField.setText(fd.open());
					
				}catch(Exception exception){

				}
			}
		});

		/* this handles the file browser for spin */
		browseButton2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				try {
					FileDialog fd = new FileDialog(configurationsWindow, SWT.OPEN);
			        fd.setText("Open");
			        String[] filterExt = { "*.*" };
			        fd.setFilterExtensions(filterExt);
			        spinTextField.setText(fd.open());
				}catch(Exception exception){

				}

			}
		});

		/* this handles the file browser for nusmv */
		browseButton3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				try {
					FileDialog fd = new FileDialog(configurationsWindow, SWT.OPEN);
			        fd.setText("Open");
			        String[] filterExt = { "*.*" };
			        fd.setFilterExtensions(filterExt);
			        nusmvTextField.setText(fd.open());
				}catch(Exception exception){

				}
			}
		});

		/* this handles the file browser for pes */
		broseButton4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				try {
					FileDialog fd = new FileDialog(configurationsWindow, SWT.OPEN);
			        fd.setText("Open");
			        String[] filterExt = { "*.*" };
			        fd.setFilterExtensions(filterExt);
			        pesTextField.setText(fd.open());
				} catch (Exception exception) {

				}

			}
		});

		/* this handles saving the locations of the model checkers */
		saveButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

					if (VerifyHandler.choice.equals("uppaal") && uppaalTextField.getText().isEmpty()) {
						VerifyHandler.choice= "";
					}
					if (VerifyHandler.choice.equals("nusmv") && nusmvTextField.getText().isEmpty()) {
						VerifyHandler.choice= "";
					}
					if (VerifyHandler.choice.equals("pes") && pesTextField.getText().isEmpty()) {
						VerifyHandler.choice= "";
					}
					if (VerifyHandler.choice.equals("spin") && spinTextField.getText().isEmpty()) {
						VerifyHandler.choice= "";
					}




					SaveConfigurations.createDoc(uppaalTextField.getText(),spinTextField.getText(),nusmvTextField.getText(),pesTextField.getText());

					configurationsWindow.close();
				


			}
		});


		configurationsWindow.setSize(517, 590);
		configurationsWindow.setLocation(0, 0);
		configurationsWindow.setText("Configurations");
		configurationsWindow.open();

		while (!configurationsWindow.isDisposed()) {
			if (!configurationsWindow.getDisplay().readAndDispatch()) {
				configurationsWindow.getDisplay().sleep();

			}
		}

		return null;
	}

}