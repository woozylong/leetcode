/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.
 * @author 1qa
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesFromList2 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null) return null;
		ListNode header = new ListNode(0);//头指针
		header.next = head;
		ListNode pre,cur = null;
		pre = header;
		cur = head;
		while(cur != null){
			//查找相等的数列
			while(cur.next != null && pre.next.val == cur.next.val){
				cur = cur.next;
			}
			//查完后如果是1->2的情况
			if(pre.next == cur){
				pre = pre.next;
			}else{
				//1->1->2
				pre.next = cur.next;
			}
			
			cur = cur.next;
		}
		return header.next;
    }
	
	public static void main(String[] args) {
		ListNode t1 = new ListNode(1);
		ListNode t2 = new ListNode(1);
		ListNode t3 = new ListNode(1);
		ListNode t4 = new ListNode(2);
		ListNode t5 = new ListNode(3);
		t1.next = t2;
		t2.next = t3;
		t3.next = t4;
		t4.next = t5;
		ListNode head = new RemoveDuplicatesFromList2().deleteDuplicates(t1);
		while(head !=null){
			System.out.println(head.val);
			head = head.next;
		}
	}
}
