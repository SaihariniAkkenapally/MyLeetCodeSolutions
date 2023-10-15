class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) 
            return null;
        
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode firstNode = dummyNode;
        ListNode secondNode = dummyNode;
        
        while(n > 0)
        {
            secondNode = secondNode.next;
            n--;
        }
        
        while(secondNode.next != null)
        {
            secondNode = secondNode.next;
            firstNode = firstNode.next;           
        }
        firstNode.next = firstNode.next.next;
        
        return dummyNode.next;
    }
}