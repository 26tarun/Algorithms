package binaryTree;

public class DiameterOfBinaryTree {

	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null)
			return 0;

		return height(root).max;
	}

	public Max height(TreeNode root) {

		Max n = new Max(0);
		if (root == null)
			return n;

		if (root.left != null && root.right != null) {
			Max l = height(root.left);
			Max r = height(root.right);
			n.height = Math.max(l.height, r.height) + 1;
			n.max = Math.max(Math.max((l.height + r.height + 2), l.max), r.max);
		}

		if (root.left == null && root.right != null) {
			Max l = height(root.right);
			n.height = l.height + 1;
			n.max = Math.max(l.max, n.height);
		}
		if (root.right == null && root.left != null) {
			Max r = height(root.left);
			n.height = r.height + 1;
			n.max = Math.max(r.max, n.height);
		}

		return n;

	}

	public void print(TreeNode root) {

		if (root.left != null)
			print(root.left);
		if (root.right != null)
			print(root.right);
		System.out.println(root.val);
	}
}

class Max {

	int height;
	int max;

	public Max(int height) {
		this.height = height;
		this.max = 0;

	}
}
