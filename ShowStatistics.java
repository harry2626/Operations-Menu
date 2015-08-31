/**
 * This class has the counters that track down how many times the different
 * operations have been carried away.
 */
public class ShowStatistics {
	
	private static int quadraticCounter;
	private static int averageCounter;
	private static int reverseCounter;
	private static int formatCounter;
	private static int statisticCounter;
	
	/**
	 * This constructor initializes all the counter to zero.
	 */
	public ShowStatistics(){
		quadraticCounter = 0;
		averageCounter = 0;
		reverseCounter = 0;
		formatCounter = 0;
		statisticCounter = 0;
	}

	/**
	 * This method gets the quadratic counter.
	 * @return Returns the quadratic counter.
	 */
	public static int getQuadraticCounter() {
		return quadraticCounter;
	}

	/**
	 * This method gets the average counter.
	 * @return Returns the average counter.
	 */
	public static int getAverageCounter() {
		return averageCounter;
	}

	/**
	 * This method gets the reverse counter.
	 * @return Returns the reverse counter.
	 */
	public static int getReverseCounter() {
		return reverseCounter;
	}

	/**
	 * This method gets the format counter.
	 * @return Returns the format counter.
	 */
	public static int getFormatCounter() {
		return formatCounter;
	}

	/**
	 * This method gets the statistics counter.
	 * @return Returns the statistics counter.
	 */
	public static int getStatisticCounter() {
		return statisticCounter;
	}

	/**
	 * This method adds one more to the quadratic counter.
	 */
	public static void addToQuadraticCounter() {
		quadraticCounter++;
	}

	/**
	 * This method adds one more to the average counter.
	 */
	public static void addToAverageCounter() {
		averageCounter++;
	}

	/**
	 * This method adds one more to the reverse counter.
	 */
	public static void addToReverseCounter() {
		reverseCounter++;
	}

	/**
	 * This method adds one more to the format counter.
	 */
	public static void addToFormatCounter() {
		formatCounter++;
	}

	/**
	 * This method adds one more to the statistics counter.
	 */
	public static void addToStatisticCounter() {
		statisticCounter++;
	}
}
