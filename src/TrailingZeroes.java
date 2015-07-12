/**
 * Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
 * @author 1qa
 *
 */
public class TrailingZeroes {
	 /*
    ���ֻҪ����5�ĸ����Ϳ����ˡ���ô��������n!��������������5�ĸ����أ�
    һ���򵥵ķ����Ǽ���floor(n/5)�����磬7!��һ��5��10!������5��
    ����֮�⣬����һ������Ҫ���ǡ�����25��125֮��������в�ֹһ��5��
    ���磬������ǿ���28!�����ǵõ�һ�������5������0�����������6��
    �����������Ҳ�ܼ򵥣����ȶ�n��5���Ƴ����еĵ���5��Ȼ���25���Ƴ������5���Դ����ơ�
    �����ǹ��ɳ��ļ����׺0�Ĺ�ʽ��
    n!��׺0�ĸ��� = n!��������5�ĸ���
              = floor(n/5) + floor(n/25) + floor(n/125) + ....
    */
	public static int trailingZeroes(int n) {
		//return (n < 5  ? 0 : (n/5 + trailingZeroes(n/5)));
		int ret = 0;
		while (n > 0) {
			ret += n / 5;
			n /= 5;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(trailingZeroes(2147483647));
	}
}
