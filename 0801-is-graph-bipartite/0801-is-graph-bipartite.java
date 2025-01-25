class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int vis[]=new int[n];
        Queue<Integer>q=new LinkedList<>();
        int colour=0;
        Arrays.fill(vis,-1);
        for(int i=0;i<n;i++){
            if(vis[i]==-1){
                  q.add(i);
                  vis[i]=colour;
                  while(q.size()>0){
                    int val=q.poll();
                    for(int nxt:graph[val]){
                     if(vis[nxt]==-1){
                        q.add(nxt);
                        vis[nxt]=1-vis[val];
                     }
                     else if(vis[nxt]==vis[val]) {
                       // System.out.println(nxt+"---->"+val+" "+colour);
                             return false;
                     }
                    }
                  }
            }
        }
       return true;
    }
}