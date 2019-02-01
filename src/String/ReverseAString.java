package String;

public class ReverseAString {
	public static String reverseWords(String s) {

		if (s == null || s.length() == 0) {
			return s;
		}

		char[] c = s.toCharArray();
		int j = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				System.out.println("at index :" + i);
				c = reverse(c, j, i - 1);
				j = i + 1;
			}
		}
		reverse(c, j, c.length - 1);
		return new String(c, 0, c.length);
	}

	public static char[] reverse(char[] c, int i, int j) {

		while (i < j) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;

		}

		return c;
	}

	public static void main(String args[]) {
		System.out.println(reverseWords(""));
		System.out.println(reverseWords("abcdef"));
		System.out.println(reverseWords(""));
	}
}
