class Solution {
   int vis[];
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        vis=new int[n];
        dfs(0,rooms,n);
       for(int i:vis)if(i==0)return false;
        return true;
        
    }

    public void dfs(int node,List<List<Integer>> adj,int n){
        vis[node]=1;
        for(int nxt:adj.get(node)){
            if(vis[nxt]==0){
                dfs(nxt,adj,n);
            }
        }
    }
}