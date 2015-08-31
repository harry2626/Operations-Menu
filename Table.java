/**
 * This class is used to create tables.
 */
public class Table {
	private String content; 
	private int operationLength;
	private int statisticsCounterLength;
	
	/**
	 * This constructor initializes the content to nothing.
	 */
	public Table(){
		content = "";
	}
	
	/**
	 * This method adds the header for the table.
	 * @param operationHeader Operations Header.
	 * @param numberOfExecutionsHeader Header for the number of times that a
	 * operation has been carried away.
	 */
	public void addTableHeader(String operationHeader, String numberOfExecutionsHeader){
		operationLength = operationHeader.length();
		statisticsCounterLength = numberOfExecutionsHeader.length();
		
		content += "\n\t" + operationHeader + "\t\t" + numberOfExecutionsHeader  
				+ "\n   =====" + ProjectUtils.repeatChar('=', operationLength) + "====="
				+ "    =====" + ProjectUtils.repeatChar('=', statisticsCounterLength) + "=====";
	}
	
	/**
	 * This method adds operations in the table.
	 * @param operation Operations that are going to be carried away in the program.
	 * @param statisticsCounter Number of times that the specific operation has been carried away.
	 */
	public void addTableOption(String operation, int statisticsCounter){
		int spacing = statisticsCounterLength/2 + operationLength - operation.length() + 15;
		content += "\n      " + operation + ProjectUtils.repeatChar(' ', spacing) + statisticsCounter;
	}
	
	/**
	 * This method displays the table.
	 */
	public void displayTable() { 
		ProjectUtils.println(content); 
	}
}
