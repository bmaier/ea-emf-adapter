
Diese Datei beschreibt die Änderungen, die nach einer Neugenerierung des Modells durchgeführt werden müssen.

TODO: Alle @generated NOT vorkommen suchen und hier dokumentieren!
Es fehlen z.B. noch die manuell erstellten Referenzen in EADiagramObject, EADiagamLink und EAConnector

------------------------------------------------------------------------------
---------- EARepository.java:

	/**
	 * A map of repositories, categorized by filenames.
	 * This ensures only one EA instance for each eap-file.
	 * 
	 * @generated NOT
	 */
	private static Map<String,Repository> repositories = new HashMap<String,Repository>();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getModels() {
		if (models == null) {

			// check if adapter-link is present and, if so, fill container
			try {
				if (openFile()) {
					return getModelsGen();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return models;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * open and, if necessary, create a connection to Enterprise Architect.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Boolean openFile() throws FileNotFoundException {
		// check if file exists
		String modelFile = getFile();
		if (modelFile == null || modelFile.length() == 0 || !new File(modelFile).exists()) {
			return false;
			//throw new FileNotFoundException(modelFile); 
		}
		// already open?
		if (eaLink != null)
			return true;
		// same file already open?
		eaLink = repositories.get(modelFile);
		if (eaLink != null)
			return true;
		// create new repository instance
		eaLink = new Repository();
		// try to open model from file
		try {
			boolean success = false;
			if (user != null && password != null && user.length() > 0) {
				success = eaLink.OpenFile2(modelFile, user, password);
			} else success = eaLink.OpenFile(modelFile);
			// if repository is successfully opened, save it in the repository map
			if (success) {
				repositories.put(modelFile, eaLink);
				eaLink.ShowWindow(1);
			} else {
				eaLink = null;
			}
			return success;
		} catch (Exception e) {
			e.printStackTrace();
			eaLink = null;
			return false;
		}
	}