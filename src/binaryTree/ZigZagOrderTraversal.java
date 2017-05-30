package binaryTree;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.LinkedList;
import java.util.List;

public class ZigZagOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();

		recursive(root, result, 0);

		return result;

	}

	public List<List<Integer>> recursive(TreeNode root, List<List<Integer>> result, int level) {

		if (root == null)
			return result;
		ArrayList<Integer> thisList;
		if (result.size() > level) {
			System.out.println("Since result size is " + result.size() + "adding  " + root.val + "at level " + level);
			thisList = (ArrayList) result.get(level);
			System.out.println("adding :" + root.val + "and the list size is" + thisList.size()
					+ "and the list content is " + thisList.toString());
			if (level % 2 == 0)
				thisList.add(root.val);

			else
				thisList.add(0, root.val);
			result.set(level, thisList);
		} else {
			System.out.println("the level is :" + level);
			thisList = new ArrayList<Integer>(2 * level);
			thisList.add(0, root.val);
			result.add(level, thisList);
			System.out.println("the list size is " + thisList.size());
		}

		System.out.println("this is level" + level + "calling left first");
		recursive(root.left, result, level + 1);
		recursive(root.right, result, level + 1);

		return result;
	}
}
