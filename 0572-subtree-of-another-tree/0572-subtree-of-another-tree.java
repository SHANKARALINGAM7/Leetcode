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

    public boolean check(TreeNode p,TreeNode q){
        if(p==null && q==null)return true;
        if(p==null || q==null)return false;
        return(p.val==q.val && check(p.left,q.left) && check(p.right,q.right));
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
         return inorder(root,subRoot);
    }

    public boolean inorder(TreeNode r, TreeNode s){
        if(r==null)return false;
        boolean l=inorder(r.left,s);
        boolean get=check(r,s);
        boolean rt=inorder(r.right,s);
        return l||get||rt;
    }
}