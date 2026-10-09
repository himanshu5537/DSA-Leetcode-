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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        Stack<Integer> stck=new Stack<>();
        int pos=1;
        // Push values between left and right
        while (temp != null) {
            if (pos >= left && pos <= right) {
                stck.push(temp.val);
            }
            temp = temp.next;
            pos++;
        }
        temp = head;
        pos = 1;
        while(temp!=null){
            if(pos>=left && pos<=right){
                temp.val=stck.pop();
            }
             temp=temp.next;
             pos++;

        }
     return head;
    }
}