package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {
	public List<Integer> rightSideView(TreeNode root) {
		Queue<TreeNode> levels = new LinkedList<TreeNode>();
		List<Integer> result = new ArrayList<Integer>();
		boolean hasAnyMore = false;
		boolean alreadyAdded = false;
		if (root != null)
			hasAnyMore = true;
		levels.add(root);
		while (hasAnyMore) {
			List<TreeNode> newList = new LinkedList<TreeNode>();
			List<Integer> intList = new LinkedList<Integer>();

			while (!levels.isEmpty()) {
				TreeNode thisNode = levels.poll();
				newList.add(thisNode);
				if (thisNode != null && !alreadyAdded) {
					result.add(thisNode.val);
					alreadyAdded = true;
				}

			}
			alreadyAdded = false;
			System.out.println(" queue is :" + levels.toString());

			for (TreeNode x : newList) {
				if (x.right != null)
					levels.add(x.right);
				if (x.left != null)
					levels.add(x.left);

			}

			if (levels.isEmpty())
				hasAnyMore = false;
		}

		return result;
	}
}
