/**
 * Given a linked list and a value x, partition it such that all nodes less than
 * x come before nodes greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the
 * two partitions.
 * 
 * For example, Given 1->4->3->2->5->2 and x = 3, return 1->2->2->4->3->5.
 * 
 * @author Administrator
 * 
 */
public class PartitionList {

	//小于x和大于等于x的放入2个链表，再合并
	 public ListNode partition(ListNode head, int x) {
		 if(head == null)
	            return head;
		 ListNode lshead  = new ListNode(0);
		 ListNode gthead  = new ListNode(0);
		 ListNode p = head, ls = lshead, gt = gthead;
		 while(p != null){
			 ListNode next = p.next;  
			 if(p.val < x){
				 ls.next = p;
				 ls = ls.next;  
				 ls.next = null; 
			 }else{
				 gt.next = p;
				 gt = gt.next;
				 gt.next = null; 
			 }
			 p = next;
		 }
		
		 ls.next = gthead.next;
		 return lshead;
	 }
	 
	 public static void main(String[] args) {
		 PartitionList pl = new PartitionList();
		 ListNode node1 = new ListNode(1);
		 ListNode node2 = new ListNode(4);
		 ListNode node3 = new ListNode(3);
		 ListNode node4 = new ListNode(2);
		 ListNode node5 = new ListNode(5);
		 ListNode node6 = new ListNode(2);
		 node1.next = node2;
		 node2.next = node3;
		 node3.next = node4;
		 node4.next = node5;
		 node5.next = node6;
		 pl.partition(node1, 3);
		 
		 while(node1!=null){
			 System.out.println(node1.val);
			 node1 = node1.next;
		 }
	}
}
