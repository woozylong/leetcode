import java.util.ArrayList;
import java.util.List;

/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

00 - 0
01 - 1
11 - 3
10 - 2
 * @author 1qa
 *
 */
public class GrayCode {
	 public List<Integer> grayCode(int n) {
		 if(n==0) {  
            ArrayList<Integer> result = new ArrayList<Integer>();  
            result.add(0);  
            return result;  
         }
		 
		 List<Integer> tmp = grayCode(n-1);  
		 int addnum = 1 << (n-1);
		 List<Integer> ret = new ArrayList<Integer>(tmp);  
		  
		 for(int i = tmp.size();i >= 0 ;i--){
			 ret.add(addnum + tmp.get(i));
		 }
		 
		 return ret;  
	 }
	 
	 public static void main(String[] args) {
		System.out.println(new GrayCode().grayCode(2));
	}
}
