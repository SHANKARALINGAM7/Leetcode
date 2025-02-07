/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        HashMap<Integer,Node>hm=new HashMap<>();
        return dfs(node,hm);

    }

    public Node dfs(Node node,HashMap<Integer,Node> hm){
         if(hm.containsKey(node.val))return hm.get(node.val);
         Node temp=new Node(node.val);
         hm.put(node.val,temp);
         for(Node nxt:node.neighbors){
             temp.neighbors.add(dfs(nxt,hm));
         }
          return temp;
    }
}