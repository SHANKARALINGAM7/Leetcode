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
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        help(root,new StringBuffer());
        return sum;
    }

    public void help(TreeNode root,StringBuffer s){
      
        s.append(root.val);
        if(root.left==null && root.right==null){
            sum+=Integer.parseInt(s.toString(),2);
             s.deleteCharAt(s.length()-1);
            return ;
        }
         if(root.left!=null)
         help(root.left,s);
         if(root.right!=null)
         help(root.right,s);
         s.deleteCharAt(s.length()-1);
    }
}