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
    public ListNode deleteMiddle(ListNode head) {

            if(head== null || head.next== null){
                return null;
            }
        List<ListNode> list= new ArrayList<>();

        ListNode temp=head;

        while(temp != null){
            list.add(temp);
            temp=temp.next;
        }

        int middle = list.size()/2;

        ListNode prev= list.get(middle-1);
        prev.next= list.get(middle).next;
        
        return head;


        



        
    }
}