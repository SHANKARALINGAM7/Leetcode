class Solution {
    public int[] findOrder(int num, int[][] arr) {
        Set<Integer>[]adj=new Set[num];
        for(int i=0;i<num;i++)adj[i]=new HashSet<>();
        for(int a[]:arr)adj[a[1]].add(a[0]);
        int inDeg[]=new int[num];
        int vis[]=new int[num];
        int i=0,count=0;
        for(Set<Integer> a:adj){
          for(int j:a)inDeg[j]++;
        }
        int ans[]=new int[num];
        Queue<Integer>q=new LinkedList<>();
        for(int k=0;k<num;k++)if(inDeg[k]==0)q.add(k);
        while(q.size()>0){
            int node=q.poll();
            ans[i++]=node;
            count++;
            vis[node]=-1;
            for(int val:adj[node]){
                if(vis[val]!=-1)inDeg[val]--;
                if(inDeg[val]==0)q.add(val);
            }
        }
        if(count!=num)return new int[]{};
        return ans;
    }
}