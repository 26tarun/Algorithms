package Arrays;

public class SearchRotatedSortedArray {

	public int search(int[] nums, int target) {
		int mI = 0;
		int result = -1;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > nums[i - 1]) {
				continue;
			} else {
				mI = i;
				break;
			}

		}

		System.out.println("the value of mI:" + mI);

		int j = 0;
		int max = nums.length - 1;
		int mid = (j + max) / 2;
		int actualIndex = (mid + mI) % nums.length;
		do {
			System.out.println("Value of j : " + j + " value of max :" + max + "value of mid :" + mid
					+ "value of actualIndex : " + actualIndex);
			if (target == nums[actualIndex])
				return actualIndex;

			if (target < nums[actualIndex]) {
				max = mid;
			} else if (target > nums[actualIndex]) {
				j = mid + 1;
			}

			mid = (j + max) / 2;
			actualIndex = (mid + mI) % nums.length;
			if (target == nums[actualIndex])
				return actualIndex;

		} while (j < max);
		return result;
	}

}
