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
    public int averageOfSubtree(TreeNode root) {
        inorder(root, new int []{0,0});
        return count;
    }

    public int[] inorder(TreeNode root,int a[]){
        if(root==null) return new int[]{0,0};
        int left[]=inorder(root.left,a);
        int right[]=inorder(root.right,a);
        int sum=left[0]+right[0]+root.val;
        int ct=left[1]+right[1]+1;
        if((sum/ct)==root.val)count++;
        return new int[]{sum,ct};
    }
}