import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S 
 * such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:
Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ¡Ü b ¡Ü c ¡Ü d)
The solution set must not contain duplicate quadruplets.
    For example, given array S = {1 0 -1 0 -2 2}, and target = 0.

    A solution set is:
    (-1,  0, 0, 1)
    (-2, -1, 1, 2)
    (-2,  0, 0, 2)
 * @author 1qa
 *
 */
public class _4Sum {
	 public static List<List<Integer>> fourSum(int[] num, int target) {
		 if(num.length == 0 ) return Collections.emptyList();
		 Arrays.sort(num);
		 List<List<Integer>> ls = new ArrayList<List<Integer>>();
		 for(int i = 0;i < num.length;i++){
			if (i > 0 && num[i] == num[i - 1])
				continue;
			 int pre1 = num[i];
			 for(int j = i + 1;j < num.length;j++){
				if (j > i + 1 && num[j] == num[j - 1])
					continue;
				 int pre2 = num[j];
				 int begindex = j + 1;
				 int endindex = num.length - 1;
				 while(begindex < endindex){
					 List<Integer> subls = new ArrayList<Integer>();
					 subls.add(pre1);
					 subls.add(pre2);
					 subls.add(num[begindex]);
					 subls.add(num[endindex]);
					 int  result = pre1 + pre2 + num[endindex] + num[begindex];
					 if(result == target){
						 ls.add(subls);
						while (begindex < endindex&& num[begindex] == num[begindex + 1])
							begindex++;
						while (begindex < endindex&& num[endindex] == num[endindex - 1])
							endindex--;
						 begindex++;
						 endindex--;
					 }else if(result < target){
						 begindex++;
					 }else{
						 endindex--;
					 }
				 }
			 }
		 }
		 return ls;
	 }
	 
	 public static void main(String[] args) {
		 List<List<Integer>> lss = fourSum(new int[]{-2,-2,-2,0,0,0,2,2,2},0);
		 for(List<Integer> ls:lss){
			 for(int i : ls){
				 System.out.print(i + " ");
			 }
			 System.out.println();
		 }
	}
}
