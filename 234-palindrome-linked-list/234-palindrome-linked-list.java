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
    public boolean isPalindrome(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp2 = dummy;
        ListNode temp = head;
        while(temp != null){
            ListNode nn = new ListNode(temp.val);
            temp2.next = nn;
            temp2 = temp2.next;
            temp = temp.next;
        }
        dummy = dummy.next;
        ListNode head1=reverseList(dummy);
        while(head!=null){
            if(head.val!=head1.val) return false;
            head=head.next;
            head1=head1.next;
        }
        return true;
        
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode pre= null;
        ListNode curr= head;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=pre;
            pre=curr;
            curr=forward;
        }return pre;
    }
}