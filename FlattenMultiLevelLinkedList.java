import java.util.ArrayDeque;
import java.util.Deque;

class Node {
	 	public int val;
	    public Node prev;
	    public Node next;
	    public Node child;
	
	    Node(int val, Node prev, Node next, Node child){
	    	this.val = val;
	    	this.child = child;
	    	this.prev = prev;
	    	this.next = next;
	}
}

public class FlattenMultiLevelLinkedList {
	public Node flatten(Node head) {
		Node pseudoHead = new Node(0, null, head, null);
		Node curr, prev = pseudoHead;
		
		Deque<Node> stack = new ArrayDeque<>();
		stack.push(head);
		
		while(!stack.isEmpty()) {
			curr = stack.pop();
			prev.next = curr;
			curr.prev = prev;
			if(curr.next != null) stack.push(curr.next);
			if(curr.child != null) {
				stack.push(curr.child);
				curr.child = null;
			}
			prev = curr;
		}
		
		pseudoHead.next.prev = null;
		return pseudoHead.next;
	}
}
