import java.util.Arrays;

/**
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1.
 * @author 1qa
 *
 */
public class LengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		 int maxLength=0;
		 int[] map = new int[256];
		 Arrays.fill(map, -1);
		 char[] a = s.toCharArray();
		 int start=0;
		 for (int i=0; i< a.length ; i++){
		   if (map[a[i]] >= start) {
		     maxLength = Math.max(maxLength, (i - start));
		     start = map[a[i]] +1;
		    }
		    map[a[i]] = i;
		  }
		 return Math.max(maxLength, (a.length -start));
		}
	
	public static void main(String[] args) {
		System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabc"));
	}
}
