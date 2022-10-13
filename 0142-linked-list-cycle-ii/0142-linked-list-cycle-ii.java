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
    public ListNode detectCycle(ListNode head) {
        // if(head.next==null) return null;
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                ListNode a=head;
                ListNode b=s;
                while(a!=b){
                    a=a.next;
                    b=b.next;
                }return a;
            }
        }return null;
    }
}