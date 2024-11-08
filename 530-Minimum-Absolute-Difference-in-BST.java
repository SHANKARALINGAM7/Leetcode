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
    int min=Integer.MAX_VALUE;
    Integer prev=null;;
    public int getMinimumDifference(TreeNode root){
         help(root);
         return min;
    }
    public void help(TreeNode root){
         if(root==null)return ;
         help(root.left);
         if(prev!=null){
            min=Math.min(min,Math.abs(root.val-prev));
         }
         prev=root.val;
         help(root.right);
         
    }
}