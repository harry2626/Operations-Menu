/**
 * This class has the methods to compute the average of a list of numbers.
 */
public class Average {
	
	private double listNumbers;
	private double total;
	private double average;
	private int counter;
	
	/**
	 * This constructor initializes counter and total to zero.
	 * Also initializes the first number of the list to listNumbers.
	 * @param listNumbers First number of the list.
	 */
	public Average(double listNumbers){
		this.listNumbers = listNumbers;
		total = 0;
		counter = 0;
	}

	/**
	 * This method gets the individual numbers.
	 * @return Returns each individual number that the user entered.
	 */
	public double getListNumbers() {
		return listNumbers;
	}

	/**
	 * This method gets the average of the numbers in the list.
	 * @return Returns average of the numbers in the list.
	 */
	public double getAverage() {
		return average;
	}

	/**
	 * This method sets the next number on the list.
	 * @param listNumbers Next number on the list.
	 */
	public void setListNumbers(double listNumbers) {
		this.listNumbers = listNumbers;
	}

	/**
	 * This method sums all the numbers on the list.
	 * @param listNumbers Numbers of the list.
	 */
	public void setTotal(double listNumbers) {
		this.total += listNumbers;
	}

	/**
	 * This method computes the average.
	 */
	public void setAverage() {
		if(counter > 0){
			this.average = total/counter;
		}
		else{
			this.average = 0;
		}
	}

	/**
	 * This method adds one to the counter used on the calculations.
	 */
	public void addCounter() {
		this.counter++;
	}
}
