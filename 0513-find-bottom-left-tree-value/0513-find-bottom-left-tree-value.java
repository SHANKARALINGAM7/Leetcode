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
    public int findBottomLeftValue(TreeNode root) {
      Queue<TreeNode>qu=new LinkedList<>();
       qu.add(root);
       int ans=0; 
       while(qu.size()>0){
         int n=qu.size();
         for(int i=0;i<n;i++){
            TreeNode node=qu.poll();
            if(node.left!=null)qu.add(node.left);
            if(node.right!=null)qu.add(node.right);
            if(i==0)ans=node.val;
            
         }
       }
       return ans;
    }
}