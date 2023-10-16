/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        if(head1.val <= head2.val)
        {
            head1.next = mergeTwoLists(head1.next, head2);
            return head1;
        }
        else{
            head2.next = mergeTwoLists(head1, head2.next);
            return head2;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) 
            return null;
        if(lists.length == 1)
            return lists[0];
        ListNode temp = mergeTwoLists(lists[0], lists[1]);
        for(int index = 2; index < lists.length; index++)
        {
            temp = mergeTwoLists(temp, lists[index]);
        }
        return temp;
    }
}