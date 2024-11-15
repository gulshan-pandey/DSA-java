package DSA;
public class LinkedListCycleII {
    /**
     * 
     * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

        There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

        Do not modify the linked list.

        

        Example 1:


        Input: head = [3,2,0,-4], pos = 1
        Output: tail connects to node index 1
        Explanation: There is a cycle in the linked list, where tail connects to the second node.

        
        Example 2:

        Input: head = [1,2], pos = 0
        Output: tail connects to node index 0
        Explanation: There is a cycle in the linked list, where tail connects to the first node.


        Example 3:

        Input: head = [1], pos = -1
        Output: no cycle
        Explanation: There is no cycle in the linked list.
     */
}




/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


 
 // Brute force

// public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        ListNode temp =head;
//        var map = new HashSet<Object>();
//          while(temp!=null){
//            if(!map.add(temp)){
//             return temp;
//            }
//            temp= temp.next;
//        }
//        return null;
//    }
// }






//  class Solution {
//     public ListNode detectCycle(ListNode head) {
//         ListNode slow =head;
//         ListNode fast =head;
//         if(head==null) return null;
//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast= fast.next.next;
//             if(slow==fast) return detect(head,slow);
//         }
//         return null;
        
        
//     }
//     ListNode detect(ListNode head, ListNode slow){
//         ListNode temp = head;
//         while(temp!=slow){
//             slow=slow.next;
//             temp =temp.next;
//         }
//         return temp;
//     }
// }




// Alternatively


// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         if(head == null) return null;
//         ListNode node = hasCycle(head);
//         if(node == null) return null;
//         ListNode p1 = head;
//         ListNode p2 = node;
//         while(p1 != p2){
//             p1 = p1.next;
//             p2 = p2.next;
//         }
//         return p1;
//     }

//     private ListNode hasCycle(ListNode head){
//         ListNode fast = head;
//         ListNode slow = head;
//         while(fast != null && fast.next != null){
//             fast = fast.next.next;
//             slow = slow.next;
//             if(slow == fast){
//                 return slow;
//             }
//         }
//         return null;
//     }
// }