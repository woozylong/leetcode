/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 * @author 1qa
 *
 */
public class MinStack {
	
	class Node{
		Node next;
		int data;
		int minValue;
		public Node(int x) {
			this.data = x;
		}
	}
	
	private Node top = null;
	
	public void push(int x) {
        if(top == null){
        	top = new Node(x);
        	top.minValue = x;
        }else{
        	Node node = new Node(x);
        	node.next = top;
        	top = node;
        	top.minValue = Math.min(top.next.minValue, node.data);
        }
    }

    public void pop() {
    	if(top.next != null){
    		top = top.next;
    	}else{
    		top = null;
    	}
    }

    public int top() {
        return top == null ? 0 : top.data; 
    }

    public int getMin() {
        return top == null ? 0 :top.minValue;
    }
    
    public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(-2);
		stack.push(0);
		stack.push(-1);
		System.out.println(stack.getMin());
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.getMin());
	}
}
