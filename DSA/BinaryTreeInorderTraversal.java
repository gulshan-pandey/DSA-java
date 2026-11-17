/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:

Input: root = [1,null,2,3]

Output: [1,3,2]

Explanation:



Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [4,2,6,5,7,1,3,9,8]

Explanation:



Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]

 


*/






/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//--------------------------------------------------SOLUTION--------------------------------------------------



//  L---- N -----R

// RECURSIVE APPROACH


// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List <Integer> ans = new ArrayList<>();

//         helper(ans, root);
//         return ans;

//     }

//     private void helper(List<Integer> ans, TreeNode root){
//         if(root ==null) return;

//         helper(ans,root.left);
//         ans.add(root.val);
//         helper(ans,root.right);

//     }
// }



// ITERATIVE APPROACH

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();


        TreeNode node = root;
        while(node != null || !stack.isEmpty()){
            
            while(node!=null){
                stack.push(node);
                node = node.left;

            }
            node = stack.pop();
            ans.add(node.val);

            node= node.right;          // the first while loop will take care of the Right side in case you are wondering about the right side of the tree. It will go to the left most node of the right subtree and then pop it and add it to the ans list.

        }
        return ans;

    }
}