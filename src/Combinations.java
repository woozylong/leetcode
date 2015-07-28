import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out
 * of 1 ... n.
 * 
 * For example, If n = 4 and k = 2, a solution is:
 * 
 * [ [2,4], [3,4], [2,3], [1,2], [1,3], [1,4], ]
 * 
 * @author Administrator
 * 
 */
public class Combinations {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> rs = new ArrayList<List<Integer>>();
		if (n <= 0 || n < k)
			return rs;
		List<Integer> item = new ArrayList<Integer>();
		comb(n, k, 1, rs, item);
		return rs;
	}

	private void comb(int n, int k, int start, List<List<Integer>> rs,
			List<Integer> item) {
		if (item.size() == k) {
			rs.add(new ArrayList<Integer>(item));
			return;
		}

		for (int i = start; i <= n; i++) {
			item.add(i);
			comb(n, k, i + 1, rs, item);
			item.remove(item.size() - 1);
		}

	}

	public static void main(String[] args) {
		Combinations cb = new Combinations();
		List<List<Integer>> ls = cb.combine(4, 2);
		for (List<Integer> l1 : ls) {
			for (Integer i : l1) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
