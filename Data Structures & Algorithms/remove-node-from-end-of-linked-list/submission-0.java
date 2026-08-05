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

        int count = 0;
        ListNode prev = null;
        ListNode cur = head;

        while(cur != null){
            count += 1;
            cur = cur.next;
        }
        
        if(count - n == 0){
            return head.next;
        }
        cur = head;
        int i = 0;
        while(i < count - n){
            i += 1;
            if(i == count - n){
                 cur.next = cur.next.next;
                 break;
            }
            cur = cur.next; 
        }
        
       
        return head;
    }
    
}
