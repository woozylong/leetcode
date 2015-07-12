/**
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 * @author 1qa
 *
 */
public class AddBinary {
	public static String addBinary(String a, String b) {
		int alength = a.length(),blength = b.length();
		int i=alength - 1,j=blength - 1;
		String result = "";
		int carry = 0;
		while(i >= 0 && j >= 0){
			int temp = a.charAt(i--) - '0' + b.charAt(j--) - '0' + carry;
			carry = temp / 2;
			temp = temp % 2;
			result = temp + result;
		}
		while(i >= 0){
			int temp = a.charAt(i--) - '0' + carry;
			carry = temp / 2;
			temp = temp % 2;
			result = temp + result;
		}
		while(j  >= 0){
			int temp = b.charAt(j--) - '0' + carry;
			carry = temp / 2;
			temp = temp % 2;
			result = temp + result;
		}
		if(carry > 0){
			result = "1" + result;
		}
		return result;

    }
	public static void main(String[] args) {
		System.out.println(addBinary("1","111"));
	}
}
