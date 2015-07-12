/**
 * Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory
 * @author 1qa
 *
 */
public class SingleNumber {
	 public static int singleNumber(int[] nums) {
		 int result = nums[0];
		 for(int i = 1 ; i < nums.length;i++){
			 result = result ^ nums[i];  
		 }
		 return result;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{1,3,3,1,2}));
	}
}
