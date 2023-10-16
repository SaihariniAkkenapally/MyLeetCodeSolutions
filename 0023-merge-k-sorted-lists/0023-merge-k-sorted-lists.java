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
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>((a,b) -> a.val - b.val);

        for(ListNode node : lists)
        {
            if(node != null)
                queue.offer(node);
        }

        ListNode dummyNode = new ListNode(-1);
        ListNode currentNode = dummyNode;

        while(!queue.isEmpty())
        {
            ListNode tempNode = queue.poll();
            currentNode.next = tempNode;
            currentNode = currentNode.next;
            if(tempNode.next != null)
                queue.offer(tempNode.next);
        }
        return dummyNode.next;
    }
}