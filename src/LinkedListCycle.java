import java.util.Arrays;


public class LinkedListCycle {
	public static boolean hasCycle(ListNode head) {
    	if(head == null || head.next == null)
    		return false;
    	ListNode slow = head;
    	ListNode fast = head;
    	while(slow.next != null && fast.next != null && fast.next.next != null){
    		slow = slow.next;
    		fast = fast.next.next;
    		if(slow == fast){
    			return true;
    		}
    	}
    	return false;
    }
	
	/**
	 * two pointers, one goes one step per time, another goes two steps per time. If they went t times and meet at the K node
		for pointer 1: t = X+nY+K
		for pointer 2: 2t = X+mY+K (m,n is unknown)
		From above equation, we could get:
		2X + 2nY + 2K = X + mY + K
		=>   X+K  =  (m-2n)Y 
		It is clear that the relationship between X and K is complementary based on Y. Which is to say, if pointer 1 goes X steps from start node and pointer 2 goes
		X steps form K node. They will meet at the start place of cycle. Complexity is O(n)
	 * @param head
	 * @return
	 */
	public static ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null)
			return null;
		ListNode slow = head;
		ListNode fast = head;
		while (slow.next != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				slow = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node2;
		System.out.println(hasCycle(node1));
		System.out.println(detectCycle(node1).val);
		
	}

}
