package DSA;
public class RotateList {
    /**
     * 
     * Given the head of a linked list, rotate the list to the right by k places.

        

        Example 1:


        Input: head = [1,2,3,4,5], k = 2
        Output: [4,5,1,2,3]



        Example 2:


        Input: head = [0,1,2], k = 4
        Output: [2,0,1]
 
     */
}



/**
 * Approach:
 * 1. Find the size of the list
 * 2. Find the end of the rotated part
 * 3. Connect the end of the rotated part to the new head
 * 4. Connect the old head to the end
 * 
 */


// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if(head==null || head.next==null) return head;
//         ListNode dummy =new ListNode(0);
//         ListNode temp = head;
//         int size=0;
//         while(temp!=null){
//             temp=temp.next;
//             size++;
//         }
//         k = k % size;
//         if (k == 0) return head;

//         ListNode temp2 = head;
//         for(int i =0; i<size-k-1;i++){
//             temp2=temp2.next;
//         }
//         ListNode join = temp2.next;         // this will be our new head
        
//         temp2.next=null;

//         dummy.next=join;


//         ListNode temp3 =dummy;
//         while(temp3.next!=null){        // Find the end of the rotated part
//             temp3=temp3.next;
//         }

//         temp3.next=head;           // Connect the old head to the end
//         return dummy.next;
//     }
// }



// class Solution {
//    public ListNode rotateRight(ListNode head, int k) {
//        if (head == null || head.next == null || k == 0) return head;
       
//        // Calculate the size of the list
//        ListNode temp = head;
//        int size = 0;
//        while (temp != null) {
//            temp = temp.next;
//            size++;
//        }
       
//        // Adjust k to avoid unnecessary rotations
//        k = k % size;
//        if (k == 0) return head; // No rotation needed
       
//        // Find the new tail (size - k - 1)
//        ListNode temp2 = head;
//        for (int i = 0; i < size - k - 1; i++) {
//            temp2 = temp2.next;
//        }
       
//        // Split the list and rearrange pointers
//        ListNode newHead = temp2.next;
//        temp2.next = null;
       
//        // Find the end of the rotated part
//        ListNode temp3 = newHead;
//        while (temp3.next != null) {
//            temp3 = temp3.next;
//        }
       
//        // Connect the old head to the end
//        temp3.next = head;
       
//        return newHead;
//    }
// }
