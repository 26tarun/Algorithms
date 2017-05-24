package Permutations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermuteNumbers {
	/*
	 * Method to invoke recursive method with initialized list and set
	 * 
	 */
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		HashSet<List<Integer>> theSet = new HashSet<List<Integer>>();
		return recurse(nums, 0, result, theSet);
	}

	/*
	 * Recursive method to generate permutations step 1) iterate through this
	 * array of numbers and store it in a list step 2) start from index 0 and
	 * compare each element step 3) if different then go ahead and swap them and
	 * have a unique arrangement of array step 4) move to next index after this
	 * and recursively call the same method
	 */
	public List<List<Integer>> recurse(int[] nums, int s, List<List<Integer>> result, HashSet<List<Integer>> theSet) {
		if (s == nums.length)
			return result;

		List<Integer> thisList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			thisList.add(nums[i]);
		}
		if (thisList.size() > 0 && !theSet.contains(thisList)) {
			result.add(thisList);
			theSet.add(thisList);
		}
		thisList = new ArrayList<Integer>();
		for (int i = s; i < nums.length; i++) {
			if (swap(nums, s, i)) {
				recurse(nums, s + 1, result, theSet);
				swap(nums, s, i);
			} else {
				recurse(nums, s + 1, result, theSet);
			}
		}

		return result;
	}

	public boolean swap(int[] arr, int a, int b) {
		int temp;
		if (arr[a] != arr[b]) {
			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
