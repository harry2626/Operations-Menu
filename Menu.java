/** 
 * This class contains the general skeleton used for all the menus.
 */
public class Menu {
	
	private String content; 
	private int nOptions;  
	private int maxChances;
	
	/**
	 * This constructor initializes the options to zero, 
	 * content to nothing and the maximum chances to the variable
	 * past as a argument.
	 * @param maxChances Maximum number of chances to select a option.
	 */
	public Menu(int maxChances) {
		nOptions = 0; 
		content = "";
		this.maxChances = maxChances; 
	}
	
	/**
	 * This method adds the header for the menu.
	 * @param s String for the header.
	 */
	public void addHeader(String s) { 
		content += "\n\t" + s + "\n\n"; 
	} 

	/**
	 * This method adds the footer for the menu.
	 * @param s String for the footer.
	 */
	public void addTail(String s) { 
		content += "\n\t" + s; 
	} 

	/**
	 * This method adds options to the menu.
	 * @param s Option to put.
	 */
	public void addOption(String s){
		nOptions++;
		content += "\t\t" + nOptions + "> " + s + "\n";
	}

	/**
	 * This method displays the menu.
	 */
	public void display() { 
		ProjectUtils.print(content); 
	}

	/**
	 * Asks for and reads the user's selection. 
	 * @return Returns 0 if all the attempts allowed have been
	 * used by the user, without entering a valid selection. 
	 * Otherwise, it returns the integer value corresponding to
	 * the valid selection by the user. 
	 */
	public int getUserSelection() { 
		int opportunity = 0; 
		boolean valid = false; 
		int selection = 0; 
		while (!valid && opportunity < maxChances) { 
			opportunity++; 
			selection = ProjectUtils.readInteger();
			if(opportunity <= maxChances-1 && !(selection >= 1 && selection <= nOptions))
				ProjectUtils.print("\n\tEnter valid selection for this menu: "); 
			if (selection >= 1 && selection <= nOptions) 
				valid = true; 
		}
		if (!valid) 
			return 0; 
		else
			return selection; 
	}

	/**
	 * This method gets the integer value representing the exit option in menu.
	 * @return Returns the integer value corresponding to the exit option
	 */
	public int getExitChoice() { 
		return nOptions; 
	}

}