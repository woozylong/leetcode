/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container.
 * |____
 * |	|
 * |____|
 * @author 1qa
 *
 */
public class ContainerWithMostWater {
	//在找下一个长方形时，长肯定会变短，要弥补这一段损失就必须加宽宽度，所以一下个就换掉两条宽中较小的那一个
	public int maxArea(int[] height) {
		int left = 0,right = height.length - 1;
		int maxarea = 0;
		while(left < right){
			int area = (right - left)*Math.min(height[right],height[left]);
			maxarea = maxarea > area ? maxarea : area;
			if(height[left] < height[right]){
				left++;
			}else{
				right--;
			}
		}
		return maxarea;
	}
	
	public static void main(String[] args) {
		int size = 3;
		int[] hegiht = new int[size];
		for(int i = 0;i < size;i++){
			hegiht[i] = i+1;
		}
		System.out.println(new ContainerWithMostWater().maxArea(hegiht));
	}
}
