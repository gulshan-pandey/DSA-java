package DSA;
public class ReverseLinkedListII {
    /**
     * 
     * Given the head of a singly linked list and two integers left and right where left <= right, 
     * reverse the nodes of the list from position left to position right, and return the reversed list.

 

        Example 1:


        Input: head = [1,2,3,4,5], left = 2, right = 4
        Output: [1,4,3,2,5]



        Example 2:

        Input: head = [5], left = 1, right = 1
        Output: [5]
 
     */
}



//  class Solution {
//     public ListNode reverseBetween(ListNode head, int left, int right) {
//         if (head == null || left == right) return head;

//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode prev = dummy;
//         int nodes = right-left;
//         for(int i =1; i<left; i++){
//             prev=prev.next;
//         }
//         ListNode curr = prev.next;
//         ListNode Next = null;
//         ListNode tail = prev;
//         for(int i=0; i<nodes+1; i++){
//             Next = curr.next;
//             curr.next =prev;
//             prev= curr; 
//             curr= Next;
//         }
//         tail.next.next=curr;
//         tail.next =prev;

//         return dummy.next;
//     }
// }






//ALTERNATIVELY

//Tutorial --> https://www.youtube.com/watch?v=oDL8vuu2Q0E



// class Solution {
//     ListNode reverseBetween(ListNode head, int left, int right) {

//         // create a dummy node to mark the head of this list
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;

//         // make markers for currentNode and for the node before reversing
//         ListNode leftPre = dummy;
//         ListNode currNode = head;

//         for (int i = 0; i < left - 1; i++) {
//             leftPre = leftPre.next;
//             currNode = currNode.next;
//         }

//         // make a marker to node where we start reversing
//         ListNode subListHead = currNode;

//         ListNode preNode = null;
//         for (int i = 0; i <= right - left; i++) {
//             ListNode nextNode = currNode.next;
//             currNode.next = preNode;
//             preNode = currNode;
//             currNode = nextNode;
//         }

//         // Join the pieces
//         leftPre.next = preNode;
//         subListHead.next = currNode;

//         return dummy.next;
//     }
// }