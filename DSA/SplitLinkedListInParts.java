package DSA;
public class SplitLinkedListInParts {
    /**
     * 
     * Given the head of a singly linked list and an integer k, split the linked list into k consecutive linked list parts.

        The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.

        The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.

        Return an array of the k parts.

        

        Example 1:

        Input: head = [1,2,3], k = 5
        Output: [[1],[2],[3],[],[]]
        Explanation:
        The first element output[0] has output[0].val = 1, output[0].next = null.
        The last element output[4] is null, but its string representation as a ListNode is [].



        Example 2:

        Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
        Output: [[1,2,3,4],[5,6,7],[8,9,10]]
        Explanation:
        The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.
     */
}




/**
 * APPROACH
 * 
 * 1. Traverse the list to compute its total size (size).
 * 2. total nodes = (size / k) + (size % k)
 * 3. Create an array of size k.
 * 4. For each part (i -->k), traverse partSize nodes (base size + 1 if an extra node is assigned).
 * 5. Detach the part by setting current.next = null,
 * 6. Store the head of each part in the result array (ListNode[]).
 * 
 */


 
//  class Solution {
//     public ListNode[] splitListToParts(ListNode head, int k) {
        
//         int size=0;
//         ListNode temp = head;
        
//         while(temp!=null){
//             temp=temp.next;
//             size++;
//         }
//         ListNode [] arr = new ListNode[k];
//         int mod =size%k;
//         int nodes=size/k;
//         ListNode temp1= head;

//         for(int i =0; i < k; i++){
//                 arr[i]=temp1;
//                 int partSize = nodes + (mod > 0 ? 1 : 0);
//                 mod--;

//                 for(int j =0; j<partSize-1 && temp1!=null; j++){
//                     temp1 = temp1.next;
//                 }

//                 if(temp1!=null){
//                     ListNode nextpart = temp1.next;
//                     temp1.next=null;
//                     temp1=nextpart;
//                 }
            
//         }

//         return arr;
//     }
       
// }