/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 * @author 1qa
 *
 */
public class ValidPalindrome {

	/**
	 * Determine whether an integer is a palindrome. Do this without extra space.
	 * @param x
	 * @return
	 */
	public static boolean isPalindrome(int x) {
		if(x < 0) return false;
        int reverse = 0, temp = x;
        while(x != 0){
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == temp;
    }

	 public static  boolean isPalindrome(String s) {
		 if(s.equals("")) return true;
	     s = s.toLowerCase();
		 int left = 0;
		 int right = s.length() - 1;
		 while(left < right){
			 while(!isValid(s.charAt(left))){
				 left++;
				 if(left >= right) return true;
			 }
			 while(!isValid(s.charAt(right))){
				 right--;
				 if(left >= right) return true;
			 }
			 if(s.charAt(left) != s.charAt(right))
				 return false;
			 left++;
			 right--;
		 }
		 return true;
	 }
	 
	 private static boolean isValid(char c) {
		if(c >= 'a' && c <='z') return true;
		if(c >= '0' && c <='9') return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome(12321));
	}
}
