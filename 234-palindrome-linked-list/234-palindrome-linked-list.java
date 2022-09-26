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
    // public int size(ListNode head){
    //     ListNode temp = head;
    //     int count = 0;
    //     while(temp != null){
    //         temp = temp.next;
    //         count++;
    //     }
    //     return count;
    // }
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
        // while(head1 != null){
        //     System.out.println(head1.val);
        //     head1 = head1.next;
        // }
        while(head!=null){
            // System.out.print(head.val +" "+head1.val);
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