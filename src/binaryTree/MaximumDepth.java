package binaryTree;

public class MaximumDepth {
	public int countDepth(TreeNode node, int count) {
		if (node == null) {
			return count;
		}
		// else if(node.left==null && node.right==null){
		// return count+1;
		// }

		return (Math.max(countDepth(node.left, count + 1), countDepth(node.right, count + 1)));

	}

	public int maxDepth(TreeNode root) {
		return countDepth(root, 0);
	}
}
