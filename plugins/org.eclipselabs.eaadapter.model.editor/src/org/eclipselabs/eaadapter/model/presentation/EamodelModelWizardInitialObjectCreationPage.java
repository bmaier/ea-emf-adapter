package org.eclipselabs.eaadapter.model.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipselabs.eaadapter.model.provider.EaEditPlugin;
import org.eclipselabs.eaadapter.model.util.EAUtil;

@SuppressWarnings("rawtypes")
public class EamodelModelWizardInitialObjectCreationPage extends WizardPage {

	/**
	 * @generated
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected List encodings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Combo encodingField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Text eaFileField;

	protected Button prefetchCheckbox;
	
	protected Button cacheCheckbox;
	
	protected Button hideWindowCheckbox;
	
	protected Button prefetchCompleteCheckbox;
	
	protected Text prefetchPackagesText;
	
	/**
	 * Pass in the selection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EamodelModelWizardInitialObjectCreationPage(String pageId) {
		super(pageId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE); {
			GridLayout layout = new GridLayout();
			layout.numColumns = 1;
			layout.verticalSpacing = 12;
			composite.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.horizontalAlignment = GridData.FILL;
			composite.setLayoutData(data);
		}

		Label eaFileLabel = new Label(composite, SWT.LEFT);
		{
			eaFileLabel.setText(EaEditorPlugin.INSTANCE.getString("_UI_EAFile"));

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			eaFileLabel.setLayoutData(data);
		}
		Composite eaFileComposite = new Composite(composite, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			layout.verticalSpacing = 0;
			eaFileComposite.setLayout(layout);

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			eaFileComposite.setLayoutData(data);
		}
		eaFileField = new Text(eaFileComposite, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			eaFileField.setLayoutData(data);
		}
		eaFileField.addModifyListener(validator);
		Button eaLoadFileButton = new Button(eaFileComposite, SWT.PUSH);
		eaLoadFileButton.setText("Load");
		eaLoadFileButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				ResourceDialog dialog = new ResourceDialog(getShell(), "Select Enterprise Architect Project", SWT.NONE);
				if (dialog.open() == ResourceDialog.OK) {
					String file = dialog.getURIText();
					if (".eap".equalsIgnoreCase(file.substring(file.length() - 4))) {
						eaFileField.setText(file);
					} else MessageDialog.openWarning(getShell(), "Wrong file extension", "The selected file does not have the expected file extension (.eap).");
				}

//				FileDialog loadDialog = new FileDialog(getShell(), SWT.OPEN);
//				loadDialog.setFilterExtensions(new String[]{"*.eap"});
//				loadDialog.setFilterNames(new String[]{"Enterpise Architect Projects"});
//				String file = loadDialog.open();
//				if (file != null)
//					eaFileField.setText(file);
			}
		});

		final Group options = new Group(composite, SWT.LEFT);
		{
			options.setText(EaEditorPlugin.INSTANCE.getString("_UI_Options"));
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			options.setLayoutData(data);

			GridLayout layout = new GridLayout();
			layout.numColumns = 1;
			layout.verticalSpacing = 12;
			options.setLayout(layout);

			cacheCheckbox = new Button(options, SWT.CHECK);
			{
				cacheCheckbox.setText(EaEditorPlugin.INSTANCE.getString("_UI_CacheButton"));
				cacheCheckbox.setSelection(true);
				
				GridData data2 = new GridData();
				data2.horizontalAlignment = GridData.FILL;
				cacheCheckbox.setLayoutData(data2);
			}
			
			hideWindowCheckbox = new Button(options, SWT.CHECK);
			{
				hideWindowCheckbox.setText(EaEditorPlugin.INSTANCE.getString("_UI_HideWindowButton"));
				hideWindowCheckbox.setSelection(true);
				
				GridData data2 = new GridData();
				data2.horizontalAlignment = GridData.FILL;
				hideWindowCheckbox.setLayoutData(data2);
			}

			prefetchCheckbox = new Button(options, SWT.CHECK);
			{
				prefetchCheckbox.setText(EaEditorPlugin.INSTANCE.getString("_UI_PrefetchButton"));
				
				GridData data2 = new GridData();
				data2.horizontalAlignment = GridData.FILL;
				prefetchCheckbox.setLayoutData(data2);
			}
			prefetchCompleteCheckbox = new Button(options, SWT.CHECK);
			{
				prefetchCompleteCheckbox.setText(EaEditorPlugin.INSTANCE.getString("_UI_PrefetchCompleteButton"));
				
				GridData data2 = new GridData();
				data2.horizontalAlignment = GridData.FILL;
				prefetchCompleteCheckbox.setLayoutData(data2);
			}
			Label packageLabel = new Label(options, SWT.LEFT);
			{
				packageLabel.setText(EaEditorPlugin.INSTANCE.getString("_UI_PrefetchPackages"));

				GridData data2 = new GridData();
				data2.horizontalAlignment = GridData.FILL;
				packageLabel.setLayoutData(data2);
			}
			prefetchPackagesText = new Text(options, SWT.BORDER);
			{
				GridData data2 = new GridData();
				data2.horizontalAlignment = GridData.FILL;
				prefetchPackagesText.setLayoutData(data2);
			}
		}
		
		Label encodingLabel = new Label(composite, SWT.LEFT);
		{
			encodingLabel.setText(EaEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			encodingLabel.setLayoutData(data);
		}
		encodingField = new Combo(composite, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			encodingField.setLayoutData(data);
		}

		for (Iterator i = getEncodings().iterator(); i.hasNext(); ) {
			encodingField.add((String)i.next());
		}

		encodingField.select(0);
		encodingField.addModifyListener(validator);

		setPageComplete(validatePage());
		setControl(composite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifyListener validator =
		new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validatePage() {
		return getEncodings().contains(encodingField.getText()) && EAUtil.getFileURI(getEaFile()) != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			eaFileField.setFocus();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encodingField.getText();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEaFile() {
		return eaFileField.getText();
	}

	public String getPrefetchPackages() {
		return prefetchPackagesText.getText();
	}

	public boolean isCacheEnabled() {
		return cacheCheckbox.getSelection();
	}
	
	public boolean isShowWindowEnabled() {
		return !hideWindowCheckbox.getSelection();
	}
	
	public boolean isPrefetchingEnabled() {
		return prefetchCheckbox.getSelection();
	}
	
	public boolean isCompletePrefetchEnabled() {
		return prefetchCompleteCheckbox.getSelection();
	}
	
	/**
	 * Returns the label for the specified type name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String getLabel(String typeName) {
		try {
			return EaEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
		}
		catch(MissingResourceException mre) {
			EaEditorPlugin.INSTANCE.log(mre);
		}
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	protected Collection getEncodings() {
		if (encodings == null) {
			encodings = new ArrayList();
			for (StringTokenizer stringTokenizer = new StringTokenizer(EaEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); ) {
				encodings.add(stringTokenizer.nextToken());
			}
		}
		return encodings;
	}
}
