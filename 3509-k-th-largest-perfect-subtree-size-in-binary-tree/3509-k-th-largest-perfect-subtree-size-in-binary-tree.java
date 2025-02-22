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
    List<Integer>l=new ArrayList<>();
    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        helper(root);
        int n=l.size();
        if(k>n)return -1;
       System.out.println(n);
        Collections.sort(l);
        return l.get(n-k);

    }
    public int helper(TreeNode root){
        if(root==null)return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        if(left==right){
            if(left==0 && (root.left!=null || root.right!=null)) return 0;
            l.add(left+right+1);
            return left+right+1;
        }
        return 0;
    }
}