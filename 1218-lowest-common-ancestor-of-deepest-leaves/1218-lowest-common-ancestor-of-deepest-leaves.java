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
   
   public TreeNode low(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p ||root==q)return root;
        TreeNode left=low(root.left,p,q);
        TreeNode right=low(root.right,p,q);

        if(left==null && right==null)return null;
        if(left!=null && right!=null)return root;
        if(left!=null)return left;
        return right;
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
          Queue<TreeNode>q=new LinkedList<>();
          q.add(root);
          while(q.size()>0){
            int len=q.size();
            List<TreeNode>l=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode n=q.poll();
                if(n.left!=null)q.add(n.left);
                if(n.right!=null)q.add(n.right);
                l.add(n);
            }
            if(q.size()==0){
                 if(l.size()==1)return l.get(0);
                return low(root,l.get(0),l.get(l.size()-1));
            }
          }

          return null;
    }
}