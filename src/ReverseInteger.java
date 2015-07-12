/**
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
 * @author 1qa
 *
 */
public class ReverseInteger {

	public static int reverse(int x) {
		long rs = 0;
        while(x != 0){
        	rs = rs * 10 + x % 10;
        	x = x / 10;
        }
        if(rs > Integer.MAX_VALUE || rs < Integer.MIN_VALUE){
            return 0;
        }
        return (int)rs;
    }
	 
	public static void main(String[] args) {
		System.out.println(reverse(-1000000003 ));
	}
}
