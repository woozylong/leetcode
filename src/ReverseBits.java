/**
 * Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?
 * @author 1qa
 *
 */
public class ReverseBits {
	public static int reverseBits(int n) {
		int answer = 0;
		int time =0;
		while(time < Integer.SIZE){
			 answer <<= 1;//ÿ������һλ
	         if ((n & 0x1)==1) { answer |= 1; }//���Ϊ1Ŀ��ĩλ��1
	         n >>= 1;
			 time++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseBits(1));
	}
}
