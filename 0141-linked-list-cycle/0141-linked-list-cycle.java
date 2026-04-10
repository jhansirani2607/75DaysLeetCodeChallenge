/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s1=head;
        ListNode f1=head;
        while(f1!=null && f1.next!=null)
        {
            s1=s1.next;
            f1=f1.next.next;
            if(s1==f1)
            {
                return true;
            }
        }
        return false;
        
    }
}