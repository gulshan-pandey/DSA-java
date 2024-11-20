package DSA;
public class CopyListWithRandomPointer {
    /**
     * 
     * A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

        Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

        For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

        Return the head of the copied linked list.

        The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

        val: an integer representing Node.val
        random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
        Your code will only be given the head of the original linked list.

        

        Example 1:


        Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
        Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]



        Example 2:

        Input: head = [[1,1],[2,1]]
        Output: [[1,1],[2,1]]



        Example 3:

        Input: head = [[3,null],[3,0],[3,null]]
        Output: [[3,null],[3,0],[3,null]]
 
     */
}


/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/



/*
 * Approach
 * 
 * in 1st loop -->we'll save the original listnode with side by side to the new copied node in map
 * in 2nd loop --> we'll retrieve the original node's references form the map and link to the copied node
 * 
 * in the end return the head of the copied node
 * 
 */



// class Solution {
//     public Node copyRandomList(Node head) {
//         if (head == null) return null; // Handle null input case
//         HashMap<Node,Node> map = new HashMap<>();
//         Node temp = head;
//         Node head2 =new Node(head.val);
//         Node temp2 = head2;
//         map.put(head,head2);
//         while(temp.next!=null){
//             temp=temp.next;
//             temp2.next= new Node(temp.val);
//             temp2=temp2.next;
//             map.put(temp,temp2);
//         }

//         Node temptemp=head;
//         Node temptemp2=head2;
       
//         while(temptemp!=null){
//             if(temptemp.random!=null){
//             temptemp2.random=map.get(temptemp.random);
//             }
//             temptemp= temptemp.next;
//             temptemp2=temptemp2.next;
//         }
//         return head2;
//     }
// }



//ALTERNATIVELY

// class Solution {
//     public Node copyRandomList(Node head) {
//         if (head == null) return null;

//         // Create a map to store the mapping from original nodes to their copies
//         HashMap<Node, Node> map = new HashMap<>();
//         Node temp = head;

//         // First pass: create copies of all nodes and store them in the map
//         while (temp != null) {
//             map.put(temp, new Node(temp.val));
//             temp = temp.next;
//         }

//         temp = head;

//         // Second pass: update the next and random pointers of the copied nodes
//         while (temp != null) {
//             Node copiedNode = map.get(temp);
//             copiedNode.next = map.get(temp.next); // Set the next pointer
//             copiedNode.random = map.get(temp.random); // Set the random pointer
//             temp = temp.next;
//         }

//         // Return the head of the copied list
//         return map.get(head);
//     }
// }
