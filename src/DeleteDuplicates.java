/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3
 * @author 1qa
 *
 */
public class DeleteDuplicates {
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
	 public static ListNode deleteDuplicates(ListNode head) {
		ListNode p = head;
		ListNode q = head;
        while(q != null){
        	int temp = q.val;
        	
        	if(temp == p.val){
        		q = q.next;
        		if(q == null){
        			p.next = q;
        		}
        		continue;
        	}
        	
        	p.next = q;
        	p = q;
    		q = q.next;
        	
        }
        return head;
	 }
	 
	 public static void main(String[] args) {
		 ListNode node1 = new ListNode(1);
		 ListNode node2 = new ListNode(2);
		 ListNode node3 = new ListNode(2);
//		 ListNode node4 = new ListNode(3);
//		 ListNode node5 = new ListNode(3);
		 node1.next = node2;
		 node2.next = node3;
//		 node3.next = node4;
//		 node4.next = node5;
		 ListNode head = deleteDuplicates(node1);
		 
		 while(head != null){
			 System.out.println(head.val);
			 head = head.next;
		 }
	}
}
