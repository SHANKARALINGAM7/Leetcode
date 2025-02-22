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
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    int m;
    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        m=k;
        helper(root);
        int n=pq.size();
        if(k>n)return -1;
        return pq.peek();

    }
    public int helper(TreeNode root){
        if(root==null)return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        if(left==right){
            if(left==0 && (root.left!=null || root.right!=null)) return 0;
            if(pq.size()==m && pq.peek()<left+right+1){
                pq.poll();
                pq.add(left+right+1);
            }
            if(pq.size()<m)pq.add(left+right+1);
            return left+right+1;
        }
        return 0;
    }
}