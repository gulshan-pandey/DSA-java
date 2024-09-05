package DSA;

public class ReverseLinkedList {
    /**
     * Given the head of a singly linked list, reverse the list, and return the reversed list.

 

        Example 1:


        Input: head = [1,2,3,4,5]
        Output: [5,4,3,2,1]
        Example 2:


        Input: head = [1,2]
        Output: [2,1]
        Example 3:

        Input: head = []
        Output: []
 
     * 
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


//using recursion


// class Solution {
//     public ListNode reverseList(ListNode head) {
//         return reverse(head);
//     }

//     private ListNode reverse(ListNode head) {                //base case
//         if (head == null || head.next == null)
//             return head;

//         ListNode last = reverse(head.next);
//         head.next.next = head;
//         head.next = null;

//         return last;
//     }
// }





// class Solution {                    //using 2pointers
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;

//         while (head != null) {
//             ListNode next = head.next;
//             head.next = prev;
//             prev = head;
//             head = next;
//         }

//         return prev;
//     }
// }



// class Solution {                 //using 3 pointers
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;
//         while(curr!=null){
//             ListNode temp =curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr= temp;
//         }
//     return prev;
//     }
// }