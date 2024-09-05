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