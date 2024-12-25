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

    public List<Integer> largestValues(TreeNode root) {
       List<Integer>  list =new ArrayList<>();
       Queue<TreeNode>qu=new LinkedList<>();
       if(root==null)return list;
       qu.add(root); 
       while(qu.size()>0){
         int n=qu.size();
         int max=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
            TreeNode node=qu.poll();
            if(node.left!=null)qu.add(node.left);
             if(node.right!=null)qu.add(node.right);
             max=Math.max(max,node.val);
         }
         list.add(max);
       }
       return list;
    }
}