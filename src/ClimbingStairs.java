/**
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * @author 1qa
 *1134903170

 */
public class ClimbingStairs {
	public int climbStairs(int n) {//too slow
		if(n == 0 || n == 1)
			return 1;
		return climbStairs(n - 1) + climbStairs(n - 2);
    }
	
	public int climbStairs2(int n) {
		if(n == 0 || n == 1)
			return 1;
		int rs = 0;
		int a = 1;
		int b = 1;
		for(int i = 2;i <= n;i++){
			rs = a + b;
			a = b;
			b = rs;
		}
		return rs;
	}
	public static void main(String[] args) {
		System.out.println(new ClimbingStairs().climbStairs2(44));
	}
}
