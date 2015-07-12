import java.util.Arrays;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * @author 1qa
 *
 */
public class ZigZagConversion {

	public static String convert(String s, int nRows) {
		if (s.length() == 0 || nRows <= 1) return s;  
		String[] output = new String[nRows];
		Arrays.fill(output, "");
		int currentrow = 0;
		int delta = 1;
        for(int i = 0 ; i < s.length();i++){
    		output[currentrow] += s.charAt(i);
    		currentrow += delta;
        	
        	if(currentrow >= nRows){
        		delta = -1;
        		currentrow = nRows-2;
        	}
        	
        	if(currentrow < 0){
        		delta = 1;
        		currentrow = 1;
        	}
        }
        
        String ret = "";
        for(int i = 0;i < output.length;i++){
        	ret += output[i];
        }
		return ret;
    }
	
	public static void main(String[] args) {
		System.out.println(convert("AB",1));
	}
}
