/**
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
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
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
     }
}

public class MergeList {
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode current = null;
    	ListNode head = new ListNode(0);//默认的头节点
    	ListNode temph = head;//保存头节点
    	while(l1 != null || l2 !=null){
    		if(l1 == null){
    			current = l2;
    			l2 = l2.next;
    		}else if(l2 == null){
    			current = l1;
    			l1 = l1.next;
    		}else if(l1.val <= l2.val){
    			current = l1;
    			l1 = l1.next;
    		}else if(l1.val > l2.val){
    			current = l2;
    			l2 = l2.next;
    		}
    		head.next = current;
    		head = current;
    	}
    	return temph.next;
}
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		mergeTwoLists(l1,l2);
	}
    
}
