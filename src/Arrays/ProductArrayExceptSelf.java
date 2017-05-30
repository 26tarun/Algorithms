package Arrays;

public class ProductArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int[] results = new int[nums.length];
		for (int k = 0; k < results.length; k++) {
			results[k] = 1;
		}
		int m = 1;
		int n = 1;
		for (int i = 0; i < (nums.length - 1); i++) {
			m = nums[i] * m;
			results[i + 1] = m;
			// System.out.println("Setting value: "+m+" at index :"+(i+1));
		}

		for (int j = (nums.length - 1); j > 0; j--) {
			n = nums[j] * n;
			results[j - 1] = results[j - 1] * n;
			// System.out.println("Setting value: "+results[j-1]+" at index
			// :"+(j-1));

		}
		return results;
	}
}
