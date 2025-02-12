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
    public int findSecondMinimumValue(TreeNode root) {
        int min[]=new int[]{-1,-1};
        inorder(root,min);
        if(min[1]==-1)return -1;
        return min[1];
    }
    public void inorder(TreeNode root,int[] min){
        if(root==null)return ;
        inorder(root.left,min);
        if(min[0]==-1 || min[0]>root.val){
            int temp=min[0];
            min[0]=root.val;
            min[1]=temp;
        }
        else if((min[1]==-1 || min[1]>root.val) && min[0]!=root.val){
            min[1]=root.val;
        }
        inorder(root.right,min);
    }
}