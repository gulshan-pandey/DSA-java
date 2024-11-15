package DSA;

public class PalindromeLinkedList {
    /**
     * Given the head of a singly linked list, return true if it is a 
        palindrome
        or false otherwise.

        

        Example 1:


        Input: head = [1,2,2,1]
        Output: true
        Example 2:


        Input: head = [1,2]
        Output: false
 
     * 
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


// Brute force   --> by revesing the LL and comparing with the original LL

// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         // If list is empty or has single node, it's a palindrome
//         if (head == null || head.next == null) {
//             return true;
//         }
   
//         // Create a copy of the original list
//         ListNode temp = head;
//         ListNode head1 = new ListNode(-1);
//         ListNode t1 = head1;
//         while (temp != null) {
//             ListNode t = new ListNode(temp.val);
//             t1.next = t;
//             temp = temp.next;
//             t1 = t1.next;
//         }
//         head1 = head1.next;  // Skip the dummy node

//         // Reverse the copied list
//         ListNode prev = null;
//         ListNode curr = head1;
//         while (curr != null) {
//             ListNode next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         // Compare original list with reversed copy
//         ListNode tempo = head;
//         ListNode reversed = prev;  // Use prev instead of head1
//         while (tempo != null) {
//             if (tempo.val != reversed.val) {
//                 return false;
//             }
//             tempo = tempo.next;
//             reversed = reversed.next;
//         }
 
//         return true;
//     }
// }








 
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         if(head==null) return true;
//         ListNode mid = middle(head);
//         ListNode last = reverse(mid);
//         ListNode curr = head;

//         while(last!=null){
//             if(last.val != curr.val){
//                 return false;
//             }
//             System.out.println(last.val +" :: " + curr.val);
//             last = last.next;
//             curr = curr.next;
//         }
//         return true;


//     }

//     private ListNode middle(ListNode head){
//         ListNode slow =head;
//         ListNode fast= head;
//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast =fast.next.next;
//            System.out.println(slow.val);

//         }
//         return slow;
//     }

//     private ListNode reverse (ListNode head){
//         ListNode prev= null;
//         ListNode curr = head;

//         while(curr!=null){
//             ListNode temp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = temp;

//         }
//         return prev;
//     }
// }








// class Solution {
    
//     public boolean isPalindrome(ListNode head) {
//         ListNode slow=head;
//         ListNode fast=head;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         ListNode h1=reverse(slow);
//         while(head!=null&&h1!=null){
//             if(head.val!=h1.val)return false;
//             head=head.next;
//             h1=h1.next;
//         }
//         return true;
//     }


//     ListNode reverse(ListNode head){
//             ListNode temp=null;
//             ListNode cur=head;
//             while(cur!=null){
//                 ListNode next=cur.next;
//                 cur.next=temp;
//                 temp=cur;
//                 cur=next;
//             }
//             return temp;
//         }

// }
