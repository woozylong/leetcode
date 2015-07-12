import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * @author 1qa
 *
 */
public class LetterCombPhoneNumber {
	
	public List<String> letterCombinations(String digits) {
		if(digits.length() == 0){
			return Collections.emptyList();
		}
		 List<String> result = new ArrayList<String>();  
		String[] map = new String[10];  
        map[0] = "";  
        map[1] = "";  
        map[2] = "abc";  
        map[3] = "def";  
        map[4] = "ghi";  
        map[5] = "jkl";  
        map[6] = "mno";  
        map[7] = "pqrs";  
        map[8] = "tuv";  
        map[9] = "wxyz"; 
        
        String middleTemp ="";
        dfs(digits, 0, middleTemp, map, result);   
        return result;  
    }  
      
	void dfs(String digits,int index,String middleTemp,String[] map,List<String> result){
		if(index == digits.length()){
			result.add(new String(middleTemp)); 
			return;
		}
		
		char strChar = digits.charAt(index);  
		for(int i = 0; i < map[strChar-'0'].length();i++){
			dfs(digits,index+1,middleTemp + map[strChar-'0'].charAt(i),map,result);
		}
	}
	
	public static void main(String[] args) {
		 List<String>  ls = new LetterCombPhoneNumber().letterCombinations("23");
		 for(String s : ls){
			 System.out.println(s);
		 }
	}
}
