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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        max=root.val;
        int val=help(root);
        return Math.max(max,val);
    }
    public int help(TreeNode node){
        if(node==null)return 0;
        int maxi=Integer.MIN_VALUE;
        int left=help(node.left);
        int right=help(node.right);
        maxi=Math.max(maxi,node.val+left+right);
        max=Math.max(max,maxi);
        max=Math.max(max,node.val);
        max=Math.max(max,node.val+left);
        max=Math.max(max,node.val+right);
        return Math.max(node.val,Math.max(left,right)+node.val);
    }
}