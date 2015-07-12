/**
 * Problem:

Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * @author 1qa
 *
 */
public class MergeSortedArray {
	/* public void merge(int A[], int m, int B[], int n) {
	        int i = m - 1, j = n - 1, k = m + n - 1;
	        while(i >= 0 && j >= 0) {
	            A[k--] = A[i] > B[j] ? A[i--] : B[j--];
	        }
	        while(j >= 0) {
	            A[k--] = B[j--];
	        }
	    }*/
	 
	public static void merge(int A[], int m, int B[], int n) {
        int i=0,j=0;
        int index = 0;
        int[] temp = new int[m+n]; 
        while(i < m && j < n){
        	if(A[i] < B[j]){
        		temp[index] = A[i];
        		i++;
        	}else{
        		temp[index] = B[j];
        		j++;
        	}
        	index++;
        }
        while(i < m){
        	temp[index] = A[i];
        	i++;
        	index++;
        }
        while(j < n){
        	temp[index] = B[j];
        	j++;
        	index++;
        }
        System.arraycopy(temp, 0, A, 0, temp.length);
    }
	public static void main(String[] args) {
		int[] A = new int[]{1,4,0};
		int[] B = new int[]{2};
		merge(A, 2,B, 1);
		System.out.println(A);
	}
}
