package binaryTree;

public class ListToTree {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return (new TreeNode(head.val));

		ListNode middle = findMiddle(head);
		TreeNode treeHead = new TreeNode(middle.val);

		if (middle != null && middle != head)
			treeHead.right = sortedListToBST(middle.next);

		if (head != null)
			treeHead.left = sortedListToBST(head);

		return treeHead;
	}

	public ListNode findMiddle(ListNode head) {
		// System.out.println("Entering into new middle");
		ListNode current = head;
		ListNode middle = head;
		ListNode prev = middle;

		while (current != null) {
			// System.out.println("this is current val : " + current.val);

			if (current.next != null) {
				current = current.next.next;

			} else {
				break;
			}

			prev = middle;
			middle = middle.next;
			// System.out.println("assigning middle the val :"+middle.val);

		}

		prev.next = null;

		return middle;

	}

	public void print(ListNode head) {
		ListNode current = head;
		while (current != null) {

			System.out.println(current.val);
			current = current.next;
		}
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
