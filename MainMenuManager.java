/**
 * This class manages the options for the Menu Operations.
 */
public class MainMenuManager {
	private Menu menu;
	private final int MAX_NUMBER_OF_CHANCES;

	/**
	 * This constructor initializes the menu for the Main Operations Menu.
	 */
	public MainMenuManager() {
		MAX_NUMBER_OF_CHANCES = 3;
		menu = new Menu(MAX_NUMBER_OF_CHANCES);
		
		menu.addHeader("Main Menu:");
		menu.addOption("Perform Operations on Numbers.");
		menu.addOption("Perform Operations on String.");
		menu.addOption("Show Use Statistics.");
		menu.addOption("Exit Program.");
		menu.addTail("Select an option: ");
	}

	/**
	 * This method displays the menu, asks the user for a selection and then manage the selection.
	 */
	public void run() {
		boolean exitMenu = false;

		do {
			menu.display();
			int choice = menu.getUserSelection();

			if (choice == 0) {
				ProjectUtils.println("\n\tI'm sorry, the program has terminated because of invalid selections.");
				exitMenu = true;
			}

			else if (choice == 1) {
				ProjectUtils.operationsOnNumbers();
			}
		
			else if (choice == 2) {
				ProjectUtils.operationsOnStrings();
			}

			else if (choice == 3) {
				ShowStatistics.addToStatisticCounter();
				ProjectUtils.showStatistics();
			}

			else if(choice == menu.getExitChoice()) {
				exitMenu = true; 
			}

		}while (!exitMenu);
	}
}