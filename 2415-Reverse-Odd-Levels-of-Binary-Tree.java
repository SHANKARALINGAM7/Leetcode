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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root.left==null)return root;
          help(root.left,root.right,0);
          return root;
    }
    public void help(TreeNode left,TreeNode right,int level){
        if(left==null)return;
        if(level%2==0){
            int val=left.val;
            left.val=right.val;
            right.val=val;
        }
        help(left.left,right.right,1+level);
        help(left.right,right.left,1+level);
    }
   
}