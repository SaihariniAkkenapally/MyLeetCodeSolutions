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
    public void reorderList(ListNode head) {
        ListNode list1 = head;
        ListNode midNode = findMid(head, true);
        ListNode list2 = midNode.next;
        midNode.next = null;
        
        list2 = reverseList(list2);
        
        ListNode dummyNode = new ListNode(-1);
        ListNode tempNode = dummyNode;
        
        while(list1 != null && list2 != null)
        {
            tempNode.next = list1;            
            list1 = list1.next;
            tempNode = tempNode.next;
            
            tempNode.next = list2;            
            list2 = list2.next;
            tempNode = tempNode.next;
        }
        
        if(list1 != null) 
            tempNode.next = list1;
        
        if(list2 != null) 
            tempNode.next = list2;
        
        head = dummyNode.next;
    }
    
    ListNode reverseList(ListNode head)
    {
        ListNode prevNode = null;
        ListNode currentNode = head;
        ListNode nextNode = null;
        
        while(currentNode != null)
        {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }
    
    ListNode findMid(ListNode head, boolean lower)
    {
        ListNode prevPointer = null, slowPointer = head, fastPointer = head;
        
        while(fastPointer != null && fastPointer.next != null)
        {
            prevPointer = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        
        if(fastPointer == null && lower)
            return prevPointer;
        
        return slowPointer;
    }
}