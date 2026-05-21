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

class Solution {
    public int height(TreeNode root) {
        if(root == null) return 0;
        

        int left =  height(root.left);
        int right = height(root.right);

        if(left == -1 || right == -1) return -1;

        if(right - left > 1 || left - right > 1 ){
            return -1;
        } else{
            return Math.max(left, right) + 1;
        }
    }

    public boolean isBalanced(TreeNode root) {
        int h = height(root);
        if(h == -1){
            return false;
        } else{
            return true;
        }
        
    }
}
