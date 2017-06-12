package Arrays;

public class MedianOfTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length == 0) {
			return medianOfOne(nums2);
		}
		if (nums2.length == 0) {
			return medianOfOne(nums1);
		}

		// System.out.println("going to calculate");
		int count = 0;
		int totalLength = nums1.length + nums2.length;
		int[] nums = new int[totalLength];
		int middle = (totalLength - 1) / 2;
		int i = 0;
		int j = 0;
		while (count <= (middle + 1)) {

			// System.out.println("checking for index" + count + " & i is "+i +
			// " & j is "+ j);
			if (i < nums1.length && j < nums2.length && nums1[i] <= nums2[j]) {
				nums[count] = nums1[i];
				i++;
				count++;
				// System.out.println("inside nums1");
			} else if (j < nums2.length && i < nums1.length && nums2[j] < nums1[i]) {
				nums[count] = nums2[j];
				j++;
				count++;
				// System.out.println("inside nums2");
			}

			else if (i == nums1.length) {
				// System.out.println("j exhausted");
				nums[count] = nums2[j];
				j++;
				count++;
			} else if (j == nums2.length) {
				// System.out.println("i exhausted");
				nums[count] = nums1[i];
				i++;
				count++;
			}

		}
		return medianOfOne(nums);
	}

	public double medianOfOne(int[] nums) {
		int middle = (nums.length - 1) / 2;
		if (nums.length % 2 == 0) {
			double value = ((nums[middle] + nums[middle + 1]) / 2.0);
			return value;
		}

		return nums[middle];
	}
}