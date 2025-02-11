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
    public int goodNodes(TreeNode root) {
        int count[]=new int[1];
        preorder(root,root.val,count);
        return count[0];
    }

    public void preorder(TreeNode root,int max,int[] count){
        if(root==null)return ;
        if(max<=root.val){
            max=root.val;
            count[0]++;
        }
        preorder(root.left,max,count);
        preorder(root.right,max,count);
    }
}