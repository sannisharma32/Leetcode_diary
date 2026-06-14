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
    public int pairSum(ListNode head) {
        
        int result=Integer.MIN_VALUE;

        ListNode temp= head;

        List<Integer>list= new  ArrayList<>();

        while(temp != null){
            list.add(temp.val);
            temp=temp.next;
        } 

        int n= list.size();
        
        int left=0;
        while(left<=(n/2)-1){
            int f=list.get(left)+list.get(n-1-left);

            result= Math.max(result,f);
            left++;
        }

        return result;


    }
}