package DSA;

public class MiddleOfLinkedList {
    
}




// class Solution {
//     int getMiddle(Node head) {
//         // Your code here.
//         Node slow = head;
//         Node fast = head;
        
//         while(fast!=null && fast.next!= null){
            
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow.data;
//     }
// }




// class Solution {
//     int getMiddle(Node head) {
//         Node curr = head;
//         int num=0;
//         while(curr!=null){
//             num++;
//             curr=curr.next;
//         }
        
//         curr=head;
//         for(int i =0; i<num/2; i++){
//             curr =curr.next;
//         }
        
//         return curr.data;
//     }
// }   
