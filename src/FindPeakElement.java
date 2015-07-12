/**
 * A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ¡Ù num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -¡Þ.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 * @author 1qa
 *
 */
public class FindPeakElement {
	public static int findPeakElement(int[] nums) {
		int l = 0;
		int r = nums.length - 1;
		int mid = r / 2;
		while (l < r) {
			if (nums[mid] < nums[mid + 1]) {
				l = mid + 1;
			} else {
				r = mid;
			}
			mid = (l + r) / 2;
		}
		return l;
    }
	
	public static void main(String[] args) {
		System.out.println(findPeakElement(new int[]{1, 2, 1, 2,1,2,1}));
	}
}
