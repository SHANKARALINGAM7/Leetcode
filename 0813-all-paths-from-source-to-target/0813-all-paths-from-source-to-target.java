class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dfs(0,graph,graph.length,new ArrayList<>());
        return ans;
    }

    public void dfs(int node,int graph[][],int n,List<Integer>sub){
        
        sub.add(node);
        if(node==n-1){
           ans.add(new ArrayList<>(sub));
        }
        else{
            for(int a:graph[node]){
                dfs(a,graph,n,sub);

        }
        }
        sub.remove(sub.size()-1);
    }
}