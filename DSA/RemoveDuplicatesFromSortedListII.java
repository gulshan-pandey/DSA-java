package DSA;
public class RemoveDuplicatesFromSortedListII {
    /**
     * 
     * Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

 

        Example 1:


        Input: head = [1,2,3,3,4,4,5]
        Output: [1,2,5]




        Example 2:


        Input: head = [1,1,1,2,3]
        Output: [2,3]
     */
}



/**
 * Using count variable to avoid duplicacy
 */

// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if (head == null || head.next == null) return head;  // Added null check

//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode temp = dummy;
//         ListNode temp2 = dummy.next;
//         int count = 0;
//         while (temp2.next != null) {
//             if (temp2.val == temp2.next.val) {
//                 count++;
//                 temp2 = temp2.next;
//                 continue;
//             } else {
//                 if (count < 1) {
//                     temp.next = temp2;
//                     temp = temp.next;
//                 }
//                 temp2 = temp2.next;
//                 count = 0;
//             }

//         }
//         if(count<1){
//             temp.next = temp2;
//             temp=temp.next;
//         }
//         temp.next=null;
//         return dummy.next;

//     }
// }





//     Using Loop within loop to eleminate duplicates


// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         // Handle empty list or single node
//         if (head == null || head.next == null) return head;
        
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode prev = dummy;
//         ListNode curr = head;
        
//         while (curr != null && curr.next != null) {
//             // Start of duplicates
//             if (curr.val == curr.next.val) {
//                 // Skip all duplicates
//                 while (curr.next != null && curr.val == curr.next.val) {
//                     curr = curr.next;
//                 }
//                 // Move to next different value
//                 curr = curr.next;
//                 prev.next = curr;
//             } else {
//                 prev = curr;
//                 curr = curr.next;
//             }
//         }
        
//         return dummy.next;
//     }
// }
