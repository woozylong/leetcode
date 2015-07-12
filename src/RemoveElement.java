/**
 * Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * @author 1qa
 *
 */
public class RemoveElement {
	public static int removeElement(int[] A, int elem) {
		if(A.length == 0) return 0;
		int j = 0;
        for(int i = 0; i < A.length;i++){
        	if(A[i]!=elem){
        		A[j] = A[i];
        		j++;
        	}
        }
        return j++;
    }
	
	public static void main(String[] args) {
		int[] A = new int[]{2,2};
		System.out.println(removeElement(A,1));
		System.out.println();
	}
}
