class Solution {
    Set<Integer>comp=new HashSet<>();
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        dfs(0,rooms,n);
        return comp.size()==n;
        
    }

    public void dfs(int node,List<List<Integer>> adj,int n){
        comp.add(node);
        for(int nxt:adj.get(node)){
            if(!comp.contains(nxt)){
                dfs(nxt,adj,n);
            }
        }
    }
}