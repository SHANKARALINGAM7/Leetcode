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
    int count=0;
    public int goodNodes(TreeNode root) {
        preorder(root,root.val);
        return count;
    }

    public void preorder(TreeNode root,int max){
        if(root==null)return ;
        if(max<=root.val){
            max=root.val;
            count++;
        }
        preorder(root.left,max);
        preorder(root.right,max);
    }
}