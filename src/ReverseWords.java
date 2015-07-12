import java.util.Arrays;
import java.util.Collections;

/**
 * Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
 * @author 1qa
 *
 */
public class ReverseWords {
	public String reverseWords(String s) {
        String[] words = s.split("\\s");
        Collections.reverse(Arrays.asList(words));
        StringBuilder rs = new StringBuilder();
        for(String w : words){
        	rs.append(w).append(" ");
        }
        return rs.toString().trim();
    }
	
	public static void main(String[] args) {
		System.out.println(new ReverseWords().reverseWords("the sky is blue"));
	}
}
