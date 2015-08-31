/**
 * This class has the methods to reverse a given string.
 */
public class ReverseStr {
	private String str;
	private String reversedStr;
	
	/**
	 * This constructor initializes a string to nothing and
	 * the other to the string given by the user.
	 * @param str String to reverse.
	 */
	public ReverseStr(String str){
		this.str = str;
		this.reversedStr = "";
	}
	
	/**
	 * This method reverses the given string.
	 */
	public void reverse(){
		for(int i = str.length() - 1; i != -1; i--){
			reversedStr += str.charAt(i);
		}
	}
	
	/**
	 * This method gets the reversed string.
	 * @return Returns the reversed string.
	 */
	public String getReversedStr(){
		return reversedStr;
	}
	
	
}
