package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DisappearedNumbers {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		HashSet<Integer> missingSet = new HashSet<Integer>();

		for (int i = 1; i <= nums.length; i++) {

			missingSet.add(i);
		}

		for (int i = 0; i < nums.length; i++) {
			if (missingSet.contains(nums[i])) { // 1,2,3
				missingSet.remove(nums[i]); // 2,2,2
			}

		}

		return new ArrayList(missingSet);

	}
}
