class Solution {
    public boolean canFinish(int num, int[][] arr) {
        Set<Integer>[]adj=new Set[num];
        for(int i=0;i<num;i++)adj[i]=new HashSet<>();
        for(int a[]:arr)adj[a[0]].add(a[1]);
        int inDeg[]=new int[num];
        int vis[]=new int[num];
        int i=0,count=0;
        for(Set<Integer> a:adj){
          for(int j:a)inDeg[j]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int k=0;k<num;k++)if(inDeg[k]==0)q.add(k);
        while(q.size()>0){
            int node=q.poll();
            count++;
            vis[node]=-1;
            for(int val:adj[node]){
                if(vis[val]!=-1)inDeg[val]--;
                if(inDeg[val]==0)q.add(val);
            }
        }

        return num==count;
    }
}