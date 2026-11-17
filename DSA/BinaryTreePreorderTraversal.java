/**
 * 
    * Given the root of a binary tree, return the preorder traversal of its nodes' values.

    

    Example 1:

    Input: root = [1,null,2,3]

    Output: [1,2,3]

    Explanation:



    Example 2:

    Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

    Output: [1,2,4,5,6,7,3,8,9]

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




    // --------------------------------SOLUTION---------------------------------------------


//   Root ---> Left ---> Right


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        List<Integer> ans = new ArrayList<>();
        if(root== null) return ans;

        stack.add(root);

        while(!stack.isEmpty()){
            
            TreeNode node = stack.pop();

            ans.add(node.val);
            if(node.right!= null){
                stack.push(node.right);
            }

            if(node.left!=null){
                stack.push(node.left);
            }

        }
        return ans;
    }
}




//RECURSIVE APPROACH

// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List <Integer> ans = new ArrayList<>();

//         helper(ans, root);
//         return ans;

//     }

//     private void helper(List<Integer> ans, TreeNode root){
//         if(root ==null) return;

//         ans.add(root.val);
//         helper(ans,root.left);
//         helper(ans,root.right);
//     }
// }






// ALTERNATIVE ITERATIVE APPROACH


// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {

//         Stack<TreeNode> stack = new Stack<>();

//         List <Integer> ans  = new ArrayList<>();
//         TreeNode node = root;

//         while(node!=null || !stack.isEmpty()){

//             while(node!=null){
//                 stack.push(node);
//                 ans.add(node.val);
//                 node = node.left;
//             }

//             node = stack.pop();
//             node = node.right;
//         }

//         return ans;

//     }
// }