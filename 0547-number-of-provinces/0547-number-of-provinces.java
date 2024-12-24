class Solution {
    public int findCircleNum(int[][] isConnected) {
      int count=0,n=isConnected.length;
      int visited[]=new int[n+1];
      for(int i=1;i<=n;i++){
         if(visited[i]==0){
             visited[i]=-1;
            dfs(isConnected,visited,i-1,n);
            count++;
         }
      }
      return count;
    }
    public void dfs(int adj[][],int[]visited,int i,int n){
        for(int j=0;j<n;j++){
            if(visited[j+1]==0 && adj[i][j]!=0){
                   visited[j+1]=-1;
                   dfs(adj,visited,j,n);
            }
        }
    }
}