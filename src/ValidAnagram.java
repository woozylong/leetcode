import java.util.Arrays;

/**
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s.
 * 
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
 * return false.
 * 
 * Note: You may assume the string contains only lowercase alphabets.
 * 
 * @author 1qa
 *
 */
public class ValidAnagram {
	 public boolean isAnagram(String s, String t) {
		 if(s.length() != t.length())
			 return false;
		 int[] ana = new int[26];
		 for(int i = 0;i < s.length();i++){
			 ana[s.charAt(i)-'a']++;
			 ana[t.charAt(i)-'a']--;
		 }
		 
		 for(int i : ana){
			 if(i != 0){
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
		System.out.println(new ValidAnagram().isAnagram("rat", "cat"));
	}
}
