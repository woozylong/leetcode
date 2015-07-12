/**
 * Given a list of non negative integers, arrange them such that they form the largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.
 * @author 1qa
 *
 */
public class LargestNumber {

	public String largestNumber(int[] nums) {
        for(int i = 0;i < nums.length;i++){
        	for(int j = 0;j < nums.length - i - 1;j++){
        		if(compare(nums[j],nums[j + 1]) < 0){
        			int temp = nums[j+1];
        			nums[j+1] = nums[j];
        			nums[j] = temp;
        		}
        	}
        }
        
        String ret = "";
        for(int s : nums){
        	ret += s;
        }

      //去掉数字开头的0，如输入[0, 0]  
        int i = 0;  
        while (i < nums.length && ret.charAt(i) == '0') {  
            i++;  
        }  
        if (i == nums.length) return "0";  
        return ret;
    }
	
	public int compare(int i,int j){
		String a = i + "" + j;
		String b = j + "" + i;
		return (int)(Long.parseLong(a) - Long.parseLong(b));  
	}
	
	public static void main(String[] args) {
		System.out.println(new LargestNumber().largestNumber(new int[]{999999998,999999997,999999999}));
	}
}
