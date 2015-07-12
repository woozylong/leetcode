
public class GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {  
		int g = gas.length;
		int[] diff = new int[g];
		for (int i = 0; i < g; i++) {
			diff[i] = gas[i] - cost[i];
		}
		int sum = 0;
		int leftGas = 0;
		int start = 0;
		for (int i = 0; i < g; i++) {
			leftGas += diff[i];
			sum += diff[i];
			if (sum < 0) {
				sum = 0;
				start = i + 1;
			}
		}
		if (leftGas < 0)
			return -1;
		return start;
    }  
}
