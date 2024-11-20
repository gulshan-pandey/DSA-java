package DSA;
public class AddTwoNumbers {
    /**
     * Problem link:- https://leetcode.com/problems/add-two-numbers
     * 
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.

        

        Example 1:

        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.



        Example 2:

        Input: l1 = [0], l2 = [0]
        Output: [0]



        Example 3:

        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]
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




// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode temp1= l1;
//         ListNode temp2 = l2;
//         ListNode dummy = new ListNode(-1);
//         ListNode dummytemp=dummy;
//         int carry = 0;
//         while(temp1!=null && temp2!=null){
//             int value=temp1.val + temp2.val+carry;
//             if(value>=10){
//                 carry=1;
//                 value%=10;
//             }else carry =0;
//             dummytemp.next = new ListNode(value);
//             temp1=temp1.next;
//             temp2= temp2.next;
//             dummytemp= dummytemp.next;
//         }

//         while(temp1!=null){
//             int value1=temp1.val+carry;
//             if(value1>=10){
//                 carry=1;
//                 value1%=10;
//             }else carry =0;
//             dummytemp.next = new ListNode(value1);
//             temp1=temp1.next;
//             dummytemp= dummytemp.next;
//         }

//         while(temp2!=null){
//             int value2=temp2.val+carry;
//             if(value2>=10){
//                 carry=1;
//                 value2%=10;
//             }else carry =0;
//             dummytemp.next = new ListNode(value2);
//             temp2= temp2.next;
//             dummytemp= dummytemp.next;
//         }
//         if(carry>0) dummytemp.next= new ListNode(carry);
//         return dummy.next;
//     }
// }








// In single Iteration, concized

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummy = new ListNode(-1);
//         ListNode current = dummy;
//         int carry = 0;

//         // Loop until both lists are exhausted and no carry remains
//         while (l1 != null || l2 != null || carry > 0) {
//             int val1 = (l1 != null) ? l1.val : 0;
//             int val2 = (l2 != null) ? l2.val : 0;

//             // Calculate sum and carry
//             int sum = val1 + val2 + carry;
//             carry = sum / 10; // Carry for next iteration
//             sum = sum % 10; // Current digit

//             // Add the result to the new list
//             current.next = new ListNode(sum);
//             current = current.next;

//             // Move to the next nodes in l1 and l2
//             if (l1 != null) l1 = l1.next;
//             if (l2 != null) l2 = l2.next;
//         }

//         return dummy.next;
//     }
// }
