import java.util.HashMap;

/**
 * Given an array of size n, find the majority element. The majority element 
 * is the element that appears more than  n/2 times.

You may assume that the array is non-empty and the majority element always exist in the array.
 * @author 1qa
 *
 */
public class MajorityElement {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,1,1};
		System.out.println(majorityElement2(a));
	}
	public static int majorityElement(int[] num) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i < num.length;i++){
        	if(map.containsKey(num[i])){
        		map.put(num[i], map.get(num[i])+1);
        	}else{
        		map.put(num[i], 1);
        	}
        }
        
        for(int i : map.keySet()){
        	if(map.get(i) > num.length/2){
        		return i;
        	}
        }
        return -1;
    }
	
	/**
	 * 每次取2个不一样的数进行消除，最后的就是返回值
	 * @param num
	 * @return
	 */
	public static int majorityElement2(int[] num) {
		int times = 0;
		int returnNum = -1;
	    for(int i : num){
	    	if(times == 0){
	    		returnNum = i;
	    		times = 1;
	    	}else{
	    		if(returnNum == i){
	    			times++;
	    		}else{
	    			times--;
	    		}
	    	}
	    }
	    return returnNum;
	}
}
