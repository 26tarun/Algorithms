package binaryTree;

public class InvertTree {

	public TreeNode invertTree(TreeNode root) {
		TreeNode temp = null;

		if (root == null)
			return null;

		else {
			temp = invertTree(root.left);
			root.left = invertTree(root.right);
			root.right = temp;
		}

		return root;
	}
}
