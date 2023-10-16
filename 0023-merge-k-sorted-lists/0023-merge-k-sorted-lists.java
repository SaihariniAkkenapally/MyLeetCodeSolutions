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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) 
            return null;
        if(lists.length == 1)
            return lists[0];
        return mergeSortOfLists(lists, 0, lists.length - 1);
    }

    ListNode mergeSortOfLists(ListNode[] lists, int left, int right)
    {
        if(right < left)
            return null;
        if(left == right)
            return lists[left];
        int mid = left + (right - left)/2;

        ListNode list1 = mergeSortOfLists(lists, left, mid);
        ListNode list2 = mergeSortOfLists(lists, mid + 1, right);

        return mergeTwoLists(list1, list2);
    }

    ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode currentNode = head; 
        
        while(list1 != null && list2 != null)
        {
            if(list1.val <= list2.val)
            {
                currentNode.next = list1;
                list1 = list1.next;
            }
            else
            {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        
        if(list1 != null && list2 == null)
            currentNode.next = list1;
        
        if(list2 != null && list1 == null)
            currentNode.next = list2;
        
        return head.next;
    }
}