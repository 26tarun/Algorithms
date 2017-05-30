package LinkedList;

public class AddNumbers {

	public static ListNode addCarry(ListNode node, int carry) {

		ListNode curr = node;
		while (curr != null) {
			System.out.println(curr.val + " " + carry);
			int totalNumber = curr.val + carry;
			carry = (totalNumber / 10);
			totalNumber = (totalNumber % 10);
			curr.val = totalNumber;

			if (curr.next == null && carry == 1) {
				curr.next = new ListNode(1);
				return node;

			}

			else
				curr = curr.next;
		}
		return node;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		int prevCarry = 0;
		ListNode current1 = l1;
		ListNode current2 = l2;
		ListNode head = null;
		ListNode curr = head;
		while (current1 != null && current2 != null) {
			int totalNumber = current1.val + current2.val;
			carry = (totalNumber / 10);
			if (prevCarry == 0) {
				totalNumber = totalNumber % 10;
			} else {
				carry = (prevCarry + totalNumber) / 10;
				totalNumber = (prevCarry + totalNumber) % 10;
			}
			prevCarry = carry;
			System.out.println(
					"current number is : " + totalNumber + "and added is :" + prevCarry + "and carry is :" + carry);
			if (head == null) {
				head = new ListNode(totalNumber);
				curr = head;
				// System.out.println("inside if for number :" +totalNumber);
			}

			else {
				curr.next = new ListNode(totalNumber);
				// if(head.next==null)head.next=curr;
				curr = curr.next;
				// System.out.println("inside else for number :" +totalNumber);
			}

			current1 = current1.next;
			current2 = current2.next;

			if (current1 == null && current2 == null && prevCarry == 1) {
				curr.next = new ListNode(1);
			}
		}

		if (current1 == null && current2 != null) {
			curr.next = current2;
			if (prevCarry == 1)
				addCarry(current2, prevCarry);

			System.out.println("Inside 1st if this is prevCarry:" + prevCarry);
		} else if (current1 != null && current2 == null) {
			curr.next = current1;
			if (prevCarry == 1)
				addCarry(current1, prevCarry);

			System.out.println("Inside 2nd if this is curr1 pointing to:" + current1.val);

		}

		// ListNode currP=head;
		// while (currP!=null){
		// System.out.println(currP.val);
		// currP=currP.next;
		// }
		return head;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
