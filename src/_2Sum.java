import java.util.HashMap;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 * @author 1qa
 *
 */
public class _2Sum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i = 0;i < nums.length;i++){
			if(hashMap.containsKey( target - nums[i])){
				return new int[]{hashMap.get(target -nums[i]),i + 1};
			}
			hashMap.put(nums[i], i+1);
			
		}
    	return new int[2];
    }
	
	public static void main(String[] args) {
		int a[] = twoSum(new int[]{0,2,4,0},0);
		System.out.println(a[0]+","+a[1]);
	}
}
