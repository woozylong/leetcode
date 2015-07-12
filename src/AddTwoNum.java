/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 * @author 1qa
 *
 */
public class AddTwoNum {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 int sum = 0;
		 int carry = 0;
		 ListNode head = new ListNode(0);
		 ListNode current = head;
		 if(l1 == null && l2 == null)
			 return head;
	      while(l1 != null || l2 !=null){
	    	  if(l1 != null && l2 !=null){
	    		  sum = l1.val + l2.val + carry;
	    		  l1 = l1.next;
	    		  l2 = l2.next;
	    	  }else if(l1 != null && l2 == null){
	    		  sum = l1.val + carry;
	    		  l1 = l1.next;
	    	  }else if(l1 == null && l2 != null){
	    		  sum = l2.val + carry;
	    		  l2 = l2.next;
	    	  }
	    	  
	    	  
	    	  ListNode node = new ListNode(sum % 10 );
	    	  current.next = node;
	    	  current = node;

	    	  if(sum > 9){
	    		  carry = sum / 10;
	    	  }else{
	    		  carry = 0;
	    	  }
	      }
		    
	      if(carry > 0){
	    	  current.next=new ListNode(1);
	      }
	      return head.next;
	 }
	 
	 public static void main(String[] args) {
		 ListNode l1_1 = new ListNode(1);
		 ListNode l1_2 = new ListNode(1);
		 l1_1.next = l1_2;
		 ListNode l2_1 = new ListNode(2);
		 ListNode l2_2 = new ListNode(2);
		 l2_1.next = l2_2;
		 ListNode ln = new AddTwoNum().addTwoNumbers(l1_1,l2_1);
		
		 while(ln != null){
			 System.out.print(ln.val);
			 ln = ln.next;
		 }
	}
}
