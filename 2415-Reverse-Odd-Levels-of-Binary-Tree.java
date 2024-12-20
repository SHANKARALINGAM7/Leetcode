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
    public TreeNode reverseOddLevels(TreeNode root) {
          List<List<Integer>>values=new ArrayList<>();
          Queue<TreeNode>qu=new LinkedList<>();
          if(root==null || root.left==null)return root;
          qu.add(root);
          int flag=1;
          while(qu.size()>0){
            List<Integer>sub=new ArrayList<>();
            int n=qu.size();
            for(int i=0;i<n;i++){
                TreeNode current = qu.poll();
                if (current.left != null) {
                    qu.add(current.left);
                    qu.add(current.right);
                    if(flag==1){
                        sub.add(0,current.left.val);
                        sub.add(0,current.right.val);
                    }
                }
            }
           if(flag==1)values.add(sub);
           flag=1-flag;
          }
          int i=0;
          qu.add(root);
          flag=1;
          System.out.println(values);
          while(qu.size()>0){
            int n=qu.size(),j=0;
            for(int k=0;k<n;k++){
               TreeNode current = qu.poll();
                if (current.left != null) {
                    qu.add(current.left);
                    qu.add(current.right);
                    if(flag==1){
                      //  System.out.println(i+" "+j);
                        current.left.val=values.get(i).get(j++);
                       // System.out.println(i+" "+j);
                        current.right.val=values.get(i).get(j++);
                    }
                }
            }
           if(flag==1)i++;
           flag=1-flag;
          
          }
          return root;
    }
   
}