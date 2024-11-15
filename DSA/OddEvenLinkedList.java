package DSA;
public class OddEvenLinkedList {
    /*
     * 
     * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

        The first node is considered odd, and the second node is even, and so on.

        Note that the relative order inside both the even and odd groups should remain as it was in the input.

        You must solve the problem in O(1) extra space complexity and O(n) time complexity.

        

        Example 1:

        Input: head = [1,2,3,4,5]
        Output: [1,3,5,2,4]


        Example 2:

        Input: head = [2,1,3,5,6,4,7]
        Output: [2,3,6,7,1,5,4]
     */
}




//Brute force


// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         if (head == null || head.next == null) return head;

//         ListNode fin = head;
//         ListNode temp = head;
//         List<Integer> arr = new ArrayList<>();
        
//         // Handle odd positions
//         while(temp != null){
//             arr.add(temp.val);
//             if(temp.next != null && temp.next.next != null)
//                 temp = temp.next.next;
//             else
//                 break;
//         }
        
//         // Handle even positions
//         ListNode temp2 = head.next;
//         while(temp2 != null){
//             arr.add(temp2.val);
//             if(temp2.next != null && temp2.next.next != null)
//                 temp2 = temp2.next.next;
//             else
//                 break;
//         }
        
//         // Update values
//         fin = head;
//         int i = 0;
//         while(fin != null && i < arr.size()){
//             fin.val = arr.get(i++);
//             fin = fin.next;
//         }
        
//         return head;
//     }
// }






 /*1 sgrigate odd and even
   2 take 2 prts to point to ODD and EVEN node
   3 segrigate them both saperately
   4 add the odd's next to the even at the last
  */

//   class Solution {
//    public ListNode oddEvenList(ListNode head) {
//        ListNode odd = head;
//        if(head==null) return null;
      
//        ListNode even = head.next;
//        ListNode evenstart = even;
//        while(even!=null&& even.next!=null){
           
//            odd.next= even.next;
//            even.next = even.next.next;

//            even = even.next;
//            odd= odd.next;
           
//        }
//        odd.next=evenstart;
//        return head;


//    }
// }




// Another Optimal approach



// class Solution {
//   public ListNode oddEvenList(ListNode head) {
//       ListNode odd = new ListNode(0);
//       ListNode even = new ListNode(0);
//       ListNode tempo = odd;
//       ListNode tempe =even;
//       ListNode temp = head;

//       while(temp!=null){
//           tempo.next =temp;
//           tempo= tempo.next;
//           temp = temp.next;


//           tempe.next =temp;
//           if(temp==null) break;
//           temp = temp.next;
//           tempe= tempe.next;
//       }

//       odd= odd.next;
//       even = even.next;
//       tempo.next =even;
//       return odd;

//   }
// }


