/**
 * This class manages the options for the Number Operations.
 */
public class NumbersMenuManager {
	private Menu menu;
	private final int MAX_NUMBER_OF_CHANCES;

	/**
	 * This constructor initializes the menu for the Number Operations Menu.
	 */
	public NumbersMenuManager() {
		MAX_NUMBER_OF_CHANCES = 3;
		menu = new Menu(MAX_NUMBER_OF_CHANCES);
		
		menu.addHeader("Operations on Numbers Menu:");
		menu.addOption("Process Quadratic Equation.");
		menu.addOption("Compute Average of List of Numbers.");
		menu.addOption("Exit.");
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
				ShowStatistics.addToQuadraticCounter();
				ProjectUtils.processQuadraticEquation();
			}
		
			else if (choice == 2) {
				ShowStatistics.addToAverageCounter();
				ProjectUtils.computeAverageOfNumbers();
			}

			else if(choice == menu.getExitChoice()) {
				exitMenu = true; 
			}

		}while (!exitMenu);
	}
}
