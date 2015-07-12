/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:     a1 ¡ú a2
                                           ¨K
                 c1 ¡ú c2 ¡ú c3
                                            ¨J            
B:  b1 ¡ú b2 ¡ú b3
begin to intersect at node c1.
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
public class IntersectionNode {
	/**
	 * Notes:
		If the two linked lists have no intersection at all, return null.
		The linked lists must retain their original structure after the function returns.
		You may assume there are no cycles anywhere in the entire linked structure.
		Your code should preferably run in O(n) time and use only O(1) memory.
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
        	return null;

        int lengthA = 0;
        int lengthB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != null){
        	lengthA++;
        	tempA = tempA.next;
        }
        while(tempB != null){
        	lengthB++;
        	tempB = tempB.next;
        }
        
        if(lengthA - lengthB > 0){
        	int moveA = lengthA - lengthB;
        	for(int i = 0; i < moveA;i++){
        		headA = headA.next;
        	}
        }else{
        	int moveB = lengthB - lengthA;
        	for(int i = 0; i < moveB;i++){
        		headB = headB.next;
        	}
        }
      
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}
