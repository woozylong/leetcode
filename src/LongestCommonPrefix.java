/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * @author 1qa
 *
 */
public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0)  
            return "";  
		String result = strs[0];
		String compare = strs[0];
		boolean isbreak = false;
        for(int i = 1;i < strs.length;i++){
        	isbreak = false;
        	compare = result;
        	int length = Math.min(compare.length(), strs[i].length());
        	for(int j = 0;j < length;j++){
        		if(compare.charAt(j) != strs[i].charAt(j)){
        			result = compare.substring(0, j);
        			isbreak = true;
        			break;
        		}
        	}
        	if(!isbreak){
        		result = compare.substring(0, length);
        	}
        }
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"11111111111","1111111211111111222"}));
	}
}
