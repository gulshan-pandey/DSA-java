package DSA;
public class MergeTwoSortedLists {
    

    /**
     * You are given the heads of two sorted linked lists list1 and list2.

        Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

        Return the head of the merged linked list.

        

        Example 1:


        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
        Example 2:

        Input: list1 = [], list2 = []
        Output: []
        Example 3:

        Input: list1 = [], list2 = [0]
        Output: [0]
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
//     public ListNode mergeTwoLists(ListNode a, ListNode b) {
//         //if one of the ll is empty
//         if(a==null) return b;
//         if(b==null) return a;

//         //comparing and merging
//         ListNode head = null , tail =null;
//         if(a.val<b.val){
//             head =tail=a;
//             a=a.next;
//         }else{
//             head=tail =b;
//             b=b.next;
//         }

//         while(a!=null && b!= null){
//             if(a.val<b.val){
//                 tail.next =a;
//                 tail =a;
//                 a=a.next;
//             }else{
//                 tail.next =b;
//                 tail =b;
//                 b=b.next;
//             }
//         }

//         //need to merge the rest of the ll
//         if(a==null) tail.next =b;
//         else tail.next =a;

//         return head;
//     }
// }







// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode temp = new ListNode(0);                // 0 is the dummy node
//         ListNode returnhead = temp;

//         while(list1!=null && list2!=null){
//             if(list1.val<list2.val){
//                 temp.next =list1;
//                 list1= list1.next;
//             }else{
//                 temp.next=list2;
//                 list2= list2.next;
//             }
//             temp= temp.next;
//         }

//         if(list1!=null) temp.next =list1;
//         if(list2!=null) temp.next =list2;
//        return returnhead.next;
//     }
// }