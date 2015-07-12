
/**
 * Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
 * @author 1qa
 *
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {  
	   if(digits == null || digits.length < 1)
		   return digits;
	   int carry = 1;
	   for(int i = 0;i < digits.length;i++){
		  int temp = (digits[digits.length - i - 1] + carry)% 10;
		  carry = (digits[digits.length - i - 1] + carry) / 10;
		  digits[digits.length - i - 1] = temp;
		  if(carry == 0)
			  return digits;
	   }
	   
	   int [] res = new int[digits.length+1];      
	   res[0] = 1;  
	   return res;  
	}
	
	public static void main(String[] args) {
		int a[] ={9,9};
		int[] b = new PlusOne().plusOne(a);
		System.out.println(b);
	}
}
