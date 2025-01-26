class Solution {
    public int longestCycle(int[] edges) {
        int  n=edges.length,max=-1;
        int vis[]=new int[n];
        for(int i=0;i<n;i++){
            if(edges[i]==-1){
                vis[i]=-1;
            }
            else if(vis[i]==0){
                int cycle=dfs(i,vis,edges,1);
                if(cycle==-1)vis[i]=-1;
                max=Math.max(cycle,max);
            }
        }
        return max;
    }
    public int dfs(int node,int vis[],int edges[],int ct){
        vis[node]=ct;
        int max=-1;
        int nxt=edges[node];
            if(nxt==-1){
                return -1;
            }
            if(vis[nxt]==0){
                max=Math.max(max,dfs(nxt,vis,edges,ct+1));
                if(max==-1)vis[nxt]=-1;
            }
            else if(vis[nxt]!=-1){
                  int a=vis[node],b=vis[nxt];
                  vis[node]=-1;
                  vis[nxt]=-1;
                  return (a-b+1);
            }
        return max;
    }
}