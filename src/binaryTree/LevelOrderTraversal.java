package binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> levels = new LinkedList<TreeNode>();
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		boolean hasAnyMore = false;
		if (root != null)
			hasAnyMore = true;
		levels.add(root);
		while (hasAnyMore) {
			List<TreeNode> newList = new LinkedList<TreeNode>();
			List<Integer> intList = new LinkedList<Integer>();

			while (!levels.isEmpty()) {
				TreeNode thisNode = levels.poll();
				newList.add(thisNode);
				intList.add(thisNode.val);
			}

			result.add(intList);

			for (TreeNode x : newList) {
				if (x.left != null)
					levels.add(x.left);
				if (x.right != null)
					levels.add(x.right);
			}

			if (levels.isEmpty())
				hasAnyMore = false;
		}

		return result;
	}
}
