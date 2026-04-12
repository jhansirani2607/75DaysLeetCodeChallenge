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
    static ListNode findMid(ListNode head)
    {
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s;
    } 
    static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode temp;
        while(head!=null)
        {
            temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    } 
    static void join(ListNode h1,ListNode h2)
    {
        ListNode th1,th2;
        while(h1!=null && h2!=null)
        {
            th1=h1.next;
            h1.next=h2;
            th2=h2.next;
            h2.next=th1;
            h1=th1;
            h2=th2;
        }
        
    }
    public void reorderList(ListNode head) 
    {   
        ListNode mid=findMid(head);
        ListNode rev=mid.next;
        mid.next=null;
        join(head,reverse(rev));
    }
}