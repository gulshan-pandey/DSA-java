package DSA;
public class PartitionList {
    /**
     * 
     * Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

        You should preserve the original relative order of the nodes in each of the two partitions.

        

        Example 1:

        Input: head = [1,4,3,2,5,2], x = 3
        Output: [1,2,2,4,3,5]



        Example 2:

        Input: head = [2,1], x = 2
        Output: [1,2]
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





//  class Solution {
//     public ListNode partition(ListNode head, int x) {
//         ListNode dummy1= new ListNode(0);
//         dummy1.next = head;
//         ListNode dummy2=new ListNode(0);
//         ListNode temp2 = dummy2;
//         ListNode temp1 = dummy1;
//         while(temp1.next!=null){
//             if(temp1.next.val<x){
//                 temp2.next=temp1.next;
//                 if(temp1.next==null)  temp1.next=null;
//                 else temp1.next = temp1.next.next;
//                 temp2 = temp2.next;
//             }else{
//                 temp1=temp1.next;
//             }

//         }
//         temp2.next=dummy1.next;

//         return dummy2.next;
        
//     }
// }






// simpler Approach


// class Solution {
//     public ListNode partition(ListNode head, int x) {
//         if (head == null) return null;

//         ListNode head1 = new ListNode(0); // Dummy node for < x
//         ListNode head2 = new ListNode(0); // Dummy node for >= x
//         ListNode ptr1 = head1;
//         ListNode ptr2 = head2;

//         ListNode ptr = head;
//         while (ptr != null) {
//             if (ptr.val < x) {
//                 ptr1.next = ptr; // Add to the < x list
//                 ptr1 = ptr1.next;
//             } else {
//                 ptr2.next = ptr; // Add to the >= x list
//                 ptr2 = ptr2.next;
//             }
//             ptr = ptr.next;
//         }

//         // Connect the two lists
//         ptr2.next = null; // End the >= x list
//         ptr1.next = head2.next; // Connect < x list to >= x list

//         return head1.next; // Return the merged list, skipping the dummy node
//     }
// }
