//package binaryTree;
//
//public class LowestCommonAncestor {
//	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//		TreeNode left = null;
//		TreeNode right = null;
//		if (root == null)
//			return null;
//
//		if (root == p)
//			return p;
//
//		if (root == q)
//			return q;
//
//		if (root.left != null)
//			left = lowestCommonAncestor(root.left, p, q);
//
//		if (root.right != null)
//			right = lowestCommonAncestor(root.right, p, q);
//
//		if (right == null)
//			return left;
//
//		if (left == null)
//			return right;
//
//		if ((left == p && right == q) || (left == q && right == p))
//			return root;
//
//		return null;
//	}
//}
//
//class TreeNode {
//	TreeNode left;
//	TreeNode right;
//	int val;
//
//	public TreeNode(TreeNode left, TreeNode right, int val) {
//		this.left = left;
//		this.right = right;
//		this.val = val;
//
//	}
//
//}