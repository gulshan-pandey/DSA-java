package DSA;

public class RemoveNthNodeFromEndOfList {
    /**
     * 
     * Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

        Example 1:


        Input: head = [1,2,3,4,5], n = 2
        Output: [1,2,3,5]
        Example 2:

        Input: head = [1], n = 1
        Output: []
        Example 3:

        Input: head = [1,2], n = 1
        Output: [1]
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


 //Brute Force  --> find the size of the LL by traversing it and then delete the node at the given index.

//  class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {

//         int size = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             temp = temp.next;
//             size++;
//         }
//         if (n == 1 && size == 1)
//             return null;

//         int delIdx = size - n;
//         if (delIdx < 1) {
//             head = head.next;
//         } else {

//             ListNode temp2 = head;
//             for (int i = 1; i < delIdx; i++) {
//                 temp2 = temp2.next;
//             }
//             temp2.next = temp2.next.next;
//         }

//         return head;
//     }
// }




//Optimized   --> In one traversal

/*
 * approach- make a nummy list and make it's next as head 
 * make 2 ptrs fast and slow point to dummy
 * Move the fast pointer n+1 steps ahead to create a gap of n nodes between fast and slow.
 * then skip the nth node and return the dummy.next
 */



// class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {

//        if(head.next==null)return null;
//        ListNode dummy = new ListNode(0);
//        dummy.next =head;

//        ListNode slow = dummy;
//        ListNode fast =dummy;
//        for(int i =0; i<=n; i++){
//            fast = fast.next;
//        }

//        while(fast!=null){
//            slow  =slow.next;
//            fast =fast.next;
//        }
//        slow.next =slow.next.next;
//        return dummy.next;


//    }
// }