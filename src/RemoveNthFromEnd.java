/**
 * Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
 * @author 1qa
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class RemoveNthFromEnd {
	//¿ìÂýÖ¸Õë
	public static ListNode removeNthFromEnd2(ListNode head, int n) {
		ListNode p = head;
		ListNode q = head;
		for(int i = 0;i < n ;i++){
			q = q.next;
			if(q == null) return head.next;
		}
		
		while(q.next != null){
			p = p.next;
			q = q.next;
		}
		
		p.next = p.next.next;
		
		return head;
	}
	
	@Deprecated
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int length = 1;
		ListNode q = head;
		while (q.next != null) {
			q = q.next;
			length++;
		}
		ListNode tmphead = new ListNode(0);
		tmphead.next = head;
		ListNode p = tmphead;
		for (int i = 0; i < length - n; i++) {
			p = p.next;
			if (p.next == null)
				p = tmphead;
		}
		p.next = p.next.next;

		return tmphead.next;
	}
	 
	 public static void main(String[] args) {
		 ListNode node1 = new ListNode(1);
		 ListNode node2 = new ListNode(2);
//		 ListNode node3 = new ListNode(3);
//		 ListNode node4 = new ListNode(4);
//		 ListNode node5 = new ListNode(5);
		 node1.next = node2;
//		 node2.next = node3;
//		 node3.next = node4;
//		 node4.next = node5;
		 ListNode node  = removeNthFromEnd2(node1,2);
		 while(node.next != null){
			 System.out.println(node.val);
			 node = node.next;
		 }
		 System.out.println(node.val);
	}
}
