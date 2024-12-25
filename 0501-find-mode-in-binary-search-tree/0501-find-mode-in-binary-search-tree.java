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
    HashMap<Integer,Integer>hm=new HashMap<>();
    int max=0;
    public int[] findMode(TreeNode root) {
        help(root);
        List<Integer>l=new ArrayList<>();
        int j=0;
        for(int i:hm.keySet()){
               if(hm.get(i)==max)l.add(i);
              }
        int[]ans=new int[l.size()];
        for(int i:l)ans[j++]=i;
        return ans;
        
    }
    public void help(TreeNode node){
        if(node==null)return;
        hm.put(node.val,hm.getOrDefault(node.val,0)+1);
        max=Math.max(max,hm.get(node.val));
        help(node.left);
        help(node.right);
    }
}