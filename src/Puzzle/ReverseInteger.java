package Puzzle;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseInteger {
	public int reverse(int x) {
		// int count = 0;
		int result = 0;
		boolean negative = false;
		Queue<Integer> numbers = new LinkedList<Integer>();
		if (x > 0) {
			while (x > 0) {

				numbers.add(x % 10);
				x = (x / 10);

			}
		} else {
			while (x < 0) {

				numbers.add(x % 10);
				x = (x / 10);

			}

		}
		long y = 0;
		if (numbers.size() > 9 && (numbers.peek() > 2 || numbers.peek() < (-2))) {
			return 0;
		}
		while (numbers.size() > 0) {
			System.out.println(numbers.toString() + " " + numbers.size());
			int z = numbers.remove();
			//
			y += z * (Math.pow(10, numbers.size()));

		}

		if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
			return 0;
		} else {
			result = (int) y;
		}
		if (negative)
			result = -result;

		return result;
	}
}
