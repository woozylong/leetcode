/**
 * Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory
 * @author 1qa
 *
 */
public class SingleNumber2 {
	 public static int singleNumber(int[] nums) {
		 int bitnum[] = new int[32];
		 int ret = 0;
		 for(int i = 0;i < 32;i++){
			 for(int j = 0;j < nums.length;j++){
				 bitnum[i] += ((nums[j] >> i) & 0x1);
			 }

			 ret |= ((bitnum[i] % 3) << i);
		 }
		 return ret;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{3,3,3,2,2,2,7}));
	}
}
