import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.

Note:
Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ¡Ü b ¡Ü c)
The solution set must not contain duplicate triplets.
    For example, given array S = {-1 0 1 2 -1 -4},

    A solution set is:
    (-1, 0, 1)
    (-1, -1, 2)
 * @author 1qa
 *
 */
public class _3Sum {
	public static List<List<Integer>> threeSum(int[] num) {
		Arrays.sort(num);
		List<List<Integer>> rsls = new ArrayList<List<Integer>>();
        for(int i = 0;i < num.length;i++){
        	int pre = num[i];
        	int beginindex = i + 1;
        	int endindex = num.length - 1;
        	if(i > 0 && num[i] == num[i-1]) continue;
        	while(beginindex < endindex){
        		int result = pre + num[beginindex] + num[endindex];
        		if(result == 0){
        			List<Integer> ls = new ArrayList<Integer>();
        			ls.add(pre);
        			ls.add(num[beginindex]);
        			ls.add(num[endindex]);
        			rsls.add(ls);
        			while(beginindex < endindex && num[beginindex]==num[beginindex+1]){
        				beginindex++;
        			}
        			while(beginindex < endindex && num[endindex]==num[endindex-1]){
        				endindex--;
        			}
        			beginindex++;
        			endindex--;
        		}else if(result < 0){
        			beginindex++;
        		}else{
        			endindex--;
        		}
        	}
        }
        return rsls;
    }
	
	public static void main(String[] args) {
		 List<List<Integer>> lss = threeSum(new int[]{-2,0,1,1,2});
		 for(List<Integer> ls:lss){
			 for(int i : ls){
				 System.out.print(i + " ");
			 }
			 System.out.println();
		 }
	}
}
