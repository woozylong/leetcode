
/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
 * @author 1qa
 *
 */
public class RemoveDuplicateArray {
	public static int removeDuplicates(int[] A) {
		if(A.length == 0) return 0;
		int j = 0;
        for(int i = 0; i < A.length;i++){
        	if(A[i] != A[j]) 
        		A[++j] = A[i];
        }
        return ++j;
    }
	
	public static void main(String[] args) {
		int[] A = new int[]{1,2};
		System.out.println(removeDuplicates(A));
		System.out.println();
	}
}
