/**
 * This class contains the methods or tools to format a string.
 */
public class FormatStr {
	private String str;
	private String pattern;
	private String strFormat;
	
	/**
	 * This constructor initializes the instance variables 
	 * str, pattern and strFormat.
	 * @param str String that the user wants to format.
	 * @param pattern Pattern in which the user wants to format the giving string.
	 */
	public FormatStr(String str, String pattern){
		this.str = str;
		this.pattern = pattern;
		strFormat = "";
	}

	/**
	 * Gets the formatted string.
	 * @return Returns the formatted string.
	 */
	public String getStrFormat() {
		return strFormat;
	}
	
	/**
	 * This method sets the string formatted to default.
	 */
	public void setStrFormatToDefault() {
			this.strFormat = "";
	}
	
	/**
	 * This method sets the pattern.
	 * @param pattern String that the pattern is set to.
	 */
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	/**
	 * This method formats the string using the pattern 
	 * that the user entered.
	 */
	public void formatString(){
		for(int i = 0, j = 0 ; i < pattern.length(); i++){
			
			if(pattern.charAt(i) == 'x' || pattern.charAt(i) == 'X'){
				if(j == str.length()){
					break;
				}
				else{
					strFormat += str.charAt(j);
					j++;
				}
			}
			else{
				strFormat += '-';
			}	
		}
	}	
}
