package Permutations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermuteNumbers {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		HashSet<List<Integer>> theSet = new HashSet<List<Integer>>();
		return recurse(nums, 0, result, theSet, true);

	}

	public List<List<Integer>> recurse(int[] nums, int s, List<List<Integer>> result, HashSet<List<Integer>> theSet,
			boolean add) {
		if (s == nums.length)
			return result;

		List<Integer> thisList = new ArrayList<Integer>();
		// add=true if we want to add this combination
		// add=false if we just want to explore further combinations since s was
		// equal to i
		if (add) {
			for (int i = 0; i < nums.length; i++) {
				thisList.add(nums[i]);
			}
		}
		if (thisList.size() > 0 && !theSet.contains(thisList)) {
			result.add(thisList);
			theSet.add(thisList);
		}

		thisList = new ArrayList<Integer>();
		for (int i = s; i < nums.length; i++) {
			if (swap(nums, s, i)) {
				recurse(nums, s + 1, result, theSet, true);
				swap(nums, s, i);
			} else {
				recurse(nums, s + 1, result, theSet, false);
			}
		}
		// if(thisList.size()>0 && !theSet.contains(thisList))
		// result.add(thisList);
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
