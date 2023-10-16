class Solution {
    public ListNode reverseList(ListNode head) {
        return recursiveReverse(head,null);     
    }

    ListNode recursiveReverse(ListNode head, ListNode prev)
    {
        if(head == null)
            return null;
        if(head.next == null)
        {
            head.next=prev;
            return head;
        }
        ListNode next = head.next;
        head.next=prev;
        prev=head;
        return recursiveReverse(next,prev);
    }
}