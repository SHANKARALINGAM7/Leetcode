class Solution {
  public class DisJointSet{
          int parent[];
          int size[];
  
          public DisJointSet(int n){
              parent=new int[n];
              size=new int[n];
              for(int i=0;i<n;i++){
                  size[i]=1;
                  parent[i]=i;
              }
          }
          public int findPar(int node){
                  int node2=parent[node];
                  if(node==node2)return node;
                  int u_par=findPar(node2);
                  parent[node]=u_par;
                  return u_par;
          }
  
          public void union(int u,int v){
              int u_par=findPar(u);
              int v_par=findPar(v);
              if(u_par==v_par)return;
              int u_size=size[u_par];
              int v_size=size[v_par];
  
              if(u_size<=v_size){
                  parent[u_par]=v_par;
                  size[v_par]=u_size+v_size;
              }
              else {
                  parent[v_par]=u_par;
                  size[u_par]=u_size+v_size;
              }
          }
          
      }
    private void traverseComponent(int[] bitwiseAnd, int curr, boolean[] visited, List<List<int[]>> adj) {
        visited[curr] = true;
        for (int[] edge : adj.get(curr)) {
            int nbr = edge[0], wt = edge[1];
            bitwiseAnd[0] &= wt; 
            if (!visited[nbr]) {
                traverseComponent(bitwiseAnd, nbr, visited, adj);
            }
        }
    }

    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        DisJointSet ds=new DisJointSet(n);
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], wt = edge[2];
            adj.get(u).add(new int[]{v, wt});
            adj.get(v).add(new int[]{u, wt});
            ds.union(u,v);
        }

        Map<Integer, Integer> parentCost = new HashMap<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int[] bitwiseAnd = new int[]{adj.get(i).isEmpty() ? 0 : adj.get(i).get(0)[1]};
                traverseComponent(bitwiseAnd, i, visited, adj);
                int parent = ds.findPar(i);
                parentCost.put(parent, bitwiseAnd[0]);
            }
        }

        int[] ans = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            int px = ds.findPar(query[i][0]);
            int py = ds.findPar(query[i][1]);
            if (px == py) {
                ans[i] = parentCost.get(px);
            } else {
                ans[i] = -1;
            }
        }

        return ans;
    }
}
