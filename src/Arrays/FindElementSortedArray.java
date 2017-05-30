package Arrays;

public class FindElementSortedArray {
	public int singleNonDuplicate(int[] nums) {

		int i = 0, j = (nums.length - 1);
		while (i <= j) {
			int middle = i + ((j - i) / 2);
			System.out.println("this is middle :" + middle);
			if ((0 < middle && middle < (nums.length - 1)) && (nums[middle] != nums[middle + 1])
					&& (nums[middle - 1] != nums[middle]))
				return nums[middle];

			else if ((0 < middle && middle <= (nums.length - 1)) && nums[middle] == nums[middle - 1] && middle % 2 == 1)
				i = middle + 1;

			else if ((0 <= middle && middle < (nums.length - 1)) && nums[middle] == nums[middle + 1] && middle % 2 == 0)
				i = middle + 1;

			else
				j = middle - 1;
			System.out.println("this is high :" + j);
		}
		return nums[i];
	}

}
