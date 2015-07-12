/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

 * @author 1qa
 *
 */
public class ExcelSheet {
	
	/**
	 * For example:
	    A -> 1
	    B -> 2
	    C -> 3
	    ...
	    Z -> 26
	    AA -> 27
	    AB -> 28 
	 * @param s
	 * @return
	 */
	public static int titleToNumber(String s) {
		if(s == null || s.length() ==0){
			return 0;
		}
        int output = 0;
    	for(int i = s.length() - 1, j = 0;i >= 0;i--,j++){
    		output += ((int)s.charAt(i) % 65 + 1)  * Math.pow(26,j) ;
    		
    	}
        return output;
    }
	
	
	/**
	 * 1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
	 * @param n
	 * @return
	 */
	public static String convertToTitle(int n) {
		StringBuffer result = new StringBuffer();
	    while(n != 0){
	    	char c = (char)((n-1) % 26 + 'A');
	    	result.append(c);
	    	n = (n-1)/26;
	    }
	    result.reverse();
	    return result.toString();
	}
	public static void main(String[] args) {
		//System.out.println(titleToNumber("AA"));
		System.out.println(convertToTitle(27));
	}
}
