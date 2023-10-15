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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempNode = head,prevNode = null;
        int length = 0;
        while(tempNode != null)
        {
            length++;
            tempNode = tempNode.next;
        }
        if(n == 1 && length == 1)
            return null;
        if(length == n)
            return head.next;
        int i = 0;
        n = length - n;
        tempNode = head;
        while(tempNode != null && i < n)
        {
            prevNode = tempNode;
            tempNode = tempNode.next;
            i++;
        }
        if(tempNode.next == null)
            prevNode.next = null;
        else
        {
            prevNode.next = tempNode.next;
        }
        return head;
    }
}