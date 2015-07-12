/**
 * Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * @author 1qa
 *
 */
public class RotateArray {
	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		k=k%n;
		if(k == 0)
			return;
		reverse(nums,0,n-1);
        reverse(nums,0,k - 1);
        reverse(nums,k,n-1);
    }
	
	private static void reverse(int[] nums,int beginpos, int endpos){
		for(int i = 0;i <= (endpos - beginpos)/2;i++){
			int temp = nums[endpos - i];
			nums[endpos - i] = nums[beginpos + i];
			nums[beginpos + i] = temp;
		}
//		for(int i : nums){
//			System.out.print(i);
//		}
//		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		rotate(arr,10);
		for(int i : arr){
			System.out.print(i);
		}
	}
}
