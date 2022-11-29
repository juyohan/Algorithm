package LeetCode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class add_two_numbers {
    public ListNode headNode = new ListNode(0);
    public ListNode head = headNode;
    public int carry = 0;
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val + carry;
        carry = sum / 10;
        headNode.next = new ListNode(sum % 10);
        headNode = headNode.next;
        
        if (l1.next != null && l2.next != null) 
            addTwoNumbers(l1.next, l2.next);
        else if (l1.next != null)
            addTwoNumbers(l1.next, new ListNode(0));
        else if (l2.next != null)
            addTwoNumbers(new ListNode(0), l2.next);
        else if (carry > 0) {
            headNode.next = new ListNode(1);
            headNode = headNode.next;
        }
        
        return head.next;
    }
}
