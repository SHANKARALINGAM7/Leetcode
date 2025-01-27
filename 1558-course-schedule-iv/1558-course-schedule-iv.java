class Solution {
    
    List<Set<Integer>>count=new ArrayList<>();
    public List<Boolean> checkIfPrerequisite(int n, int[][] arr, int[][] queries) {
        List<List<Integer>>adj=new ArrayList<>();
        HashSet<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
           adj.add(new ArrayList<>());
           count.add(new HashSet<>());
        }
        int inDegree[]=new int[n];
        for(int a[]:arr){
            adj.get(a[1]).add(a[0]);
            inDegree[a[0]]++;
        }
        for(int i=0;i<n;i++){
            if(inDegree[i]==0)s.add(i);
        }
       // System.out.println(adj);
        for(int i:s)dfs(i,adj,inDegree);

       List<Boolean> ans=new ArrayList<>();
       for(int i=0;i<queries.length;i++){
        int a=queries[i][0],b=queries[i][1];
           ans.add(count.get(a).contains(b));
       }
     return ans;
    }

    public void dfs(int par,List<List<Integer>> adj,int inDegree[]){
        
        for(int child:adj.get(par)){

          count.get(child).add(par);
          count.get(child).addAll(count.get(par));
            inDegree[child]--;
         if(inDegree[child]==0){
            dfs(child,adj,inDegree);
            }
        }
    }
}