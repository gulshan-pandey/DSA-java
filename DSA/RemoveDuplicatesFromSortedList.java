package DSA;
public class RemoveDuplicatesFromSortedList {
    /**
     * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

        

        Example 1:


        Input: head = [1,1,2]
        Output: [1,2]


        Example 2:


        Input: head = [1,1,2,3,3]
        Output: [1,2,3]
     */
}


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

//----------------------Solution---------------

//  class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if(head==null) return head;
//         ListNode node = head;
//         while(node.next!=null){
//                 if(node.val == node.next.val){
//                     node.next = node.next.next;
//                 }else{
//                     node =node.next;
//                 }
//         }
//         return head;
//     }
// }




// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if(head==null) return head;
//         ListNode prev = head, curr =head.next;
//         while(curr!=null){
//             if(prev.val==curr.val){
//                 prev.next =curr.next;
//                 curr= curr.next;
//             }
//             else{
//                 prev = curr;
//             }
//         }
//         return head;
//     }
// }