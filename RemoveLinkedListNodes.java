class ListNode{
	 int val;
	 ListNode next;
	 ListNode() {}
	 ListNode(int val) { this.val = val; }
	 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RemoveLinkedListNodes {
	public ListNode removeElements(ListNode head, int val) {
		if(head == null) return head; //this handles empty LL
		//the below is for single element LL
		ListNode temp = new ListNode(0);
		temp.next = head;
		//This is to keep track of previous element so as to skip desired
		ListNode prev = temp;
		ListNode curr = head;
		while(curr != null) {
			if(curr.val == val)
				prev.next = curr.next;
			else
				prev = curr;
			curr = curr.next;
		}	
		return temp.next;
	}
}
