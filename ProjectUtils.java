import java.util.Scanner;

/**
 * This class has the general utilities that the project needs.
 * Like to read input from the user and print something on the screen.
 * Also it contains the methods that manage the individual options inside the 
 * main menu, operations on numbers menu and operations on strings menu.
 */
public class ProjectUtils {
	private static final Scanner input = new Scanner(System.in);
	
	/**
	 * This method reads a integer input from the keyboard.
	 * @return Returns the integer read from the user.
	 */
	public static int readInteger() { 
		return input.nextInt(); 
	}
	
	/**
	 * This method reads a float input from the keyboard.
	 * @return Returns the float read from the user.
	 */
	public static float readFloat() { 
		return input.nextFloat(); 
	}
	
	/**
	 * This method reads a double input from the keyboard.
	 * @return Returns the double read from the user.
	 */
	public static double readDouble() { 
		return input.nextDouble(); 
	}
	
	/**
	 * This method reads a string input from the keyboard.
	 * @return Returns the string read from the user.
	 */
	public static String read() { 
		return input.next(); 
	}
	
	/**
	 * This method prints the string past as a argument without a new line.
	 * @param str String that is going to be printed on screen.
	 */
	public static void print(String str) { 
		System.out.print(str); 
	} 
	
	/**
	 * This method prints the string past as a argument with a new line.
	 * @param str String that is going to be printed on screen.
	 */
	public static void println(String str) { 
		System.out.println(str); 
	}
	
	/**
	 * This method repeats a character a determined number of times.
	 * @param toRepeat Character that is going to be repeated.
	 * @param nTimes Number of times that the character is going to be repeated.
	 * @return Returns the String with the character toRepeat a determined number of times.
	 */
	public static String repeatChar(char toRepeat, int nTimes){
		String result= "";
		
		for(int i = 0; i < nTimes; i++){
			result += toRepeat;
		}
		return result;
	}

	/**
	 * This method creates a NumbersMenuManager object and 
	 * also applies the method run to it.
	 */
	public static void operationsOnNumbers() {
		NumbersMenuManager numbersMenuManager = new NumbersMenuManager();
		numbersMenuManager.run(); 
	}
	
	/**
	 * This method creates a StringMenuManager object and 
	 * also applies the method run to it.
	 */
	public static void operationsOnStrings() {
		StringMenuManager stringMenuManager = new StringMenuManager(); 
		stringMenuManager.run(); 
	}
	
	/**
	 * This method adds the strings that are going to be displayed 
	 * on the Statistics table and displays it.
	 */
	public static void showStatistics() {
		 Table statistics = new Table();
		 
		 statistics.addTableHeader("Operations in the Program:", "Number of Times Executed:");
		 statistics.addTableOption("Process a Quadratic Equation", ShowStatistics.getQuadraticCounter());
		 statistics.addTableOption("Compute Average of Numbers", ShowStatistics.getAverageCounter());
		 statistics.addTableOption("Reverse a String", ShowStatistics.getReverseCounter());
		 statistics.addTableOption("Format a String", ShowStatistics.getFormatCounter());
		 statistics.addTableOption("Show Statistics", ShowStatistics.getStatisticCounter());
		 
		 statistics.displayTable();
	}
	
	/**
	 * This method operates how the option 
	 * reverse a string is going to be carried away.
	 */
	public static void reverseAString() {
		String strReverse;
		
		print("\n\tEnter the string that you want to reverse: ");
		strReverse = read();
		ReverseStr strObj = new ReverseStr(strReverse);
		strObj.reverse();
		System.out.println("\tThe reversed string is \"" + strObj.getReversedStr() + "\"\n");
	}

	/**
	 * This method operates how the option 
	 * format a string is going to be carried away.
	 */
	public static void formatAString() {
		String strPattern, str;
		boolean valid = false;
		int answer;
		
		print("\n\tEnter the string that you want to format: ");
		str = read();
		print("\n\tEnter the pattern of the string in x or -."
						+ "\n\tExample: String is 0123456789, Pattern is xxx-xxx-xxxx -> Result 012-345-6789"
						+ "\n\tPattern: ");
		strPattern = read();
		
		FormatStr formatObj = new FormatStr(str, strPattern);
		formatObj.formatString();
			
		print("\n\tThe string you entered in the corresponding pattern is: " + formatObj.getStrFormat());
		formatObj.setStrFormatToDefault();
		
			do{
				print("\n\n\tDo you want to use another pattern? "
							+ "\n   \t1> Yes"
							+ "\n   \t2> No"
							+ "\n   \tSelection: ");
				answer = readInteger();
				if(answer == 1){
					print("\n\tEnter the new pattern of the string: ");
					strPattern = read();
					formatObj.setPattern(strPattern);
					formatObj.formatString();
					print("\n\tThe string you entered in the corresponding pattern is: " + formatObj.getStrFormat());
				}
				else if(answer == 2){
					valid = true;
				}
				else{
					println("\n\tPlease enter a valid option.");
					
				}
			}while(!valid);
	}
	
	/**
	 * This method operates how the option 
	 * process a quadratic equation is going to be carried away.
	 */
	public static void processQuadraticEquation() {
		FloatPair floatObj;
		float a, b, c;
			
		print("\n\tEnter the coefficient of the squared term: ");
		a = readFloat();
		print("\n\tEnter the coefficient of the linear term: ");
		b = readFloat();
		print("\n\tEnter the coefficient of the constant term: ");
		c = readFloat();
			
		QuadraticEquation quadraticObj = new QuadraticEquation(a,b,c);
		floatObj = quadraticObj.getRealSolutions();
			
		if(floatObj == null){
			println("\n\tThere are no solutions for these coefficients.");
		}
		else if(quadraticObj.realSolutionsCount() == 1){
			println("\n\tThere is one solution for these coefficients: "
					+ floatObj.getFirst() + ".");
		}
		else{
			println("\n\tThere are two solutions for these coefficients: "
					+ floatObj.getFirst() + " and " + floatObj.getSecond() + ".");
		}
	}

	/**
	 * This method operates how the option 
	 * compute a average of a list of numbers 
	 * is going to be carried away.
	 */
	public static void computeAverageOfNumbers() {
		double numbers;
		
		print("\n\tEnter numbers or to finish enter -1:\n\t-> ");
		numbers = readDouble();
			
		Average aveObj = new Average(numbers);
			
		while(aveObj.getListNumbers() != -1){
			aveObj.setTotal(numbers);
			print("\t-> ");
			aveObj.addCounter();
			numbers = readDouble();
			aveObj.setListNumbers(numbers);
		}
		aveObj.setAverage();
		println("\n\tThe average of the number is " + aveObj.getAverage());
	}
}
