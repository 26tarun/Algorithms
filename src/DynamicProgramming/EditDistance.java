package DynamicProgramming;

public class EditDistance {
	public int minDistance(String word1, String word2) {
		if (word1.equals(word2))
			return 0;

		else if (word1 == null || word1.equals(""))
			return word2.length();
		else if (word2 == null || word2.equals(""))
			return word1.length();
		char[] first = word1.toCharArray();
		char[] second = word2.toCharArray();
		int[][] editDist = new int[word2.length() + 1][word1.length() + 1];
		for (int k = 1; k <= first.length; k++) {
			editDist[0][k] = k;

		}
		for (int l = 1; l <= second.length; l++) {
			editDist[l][0] = l;
		}

		for (int i = 1; i < editDist.length; i++) {
			for (int j = 1; j < editDist[i].length; j++) {

				int result = Math.min(editDist[i - 1][j], Math.min(editDist[i - 1][j - 1], editDist[i][j - 1]));

				if (second[i - 1] == first[j - 1]) {
					editDist[i][j] = editDist[i - 1][j - 1];
				}

				else {
					editDist[i][j] = result + 1;
				}
			}

		}

		return editDist[second.length][first.length];
	}
}
