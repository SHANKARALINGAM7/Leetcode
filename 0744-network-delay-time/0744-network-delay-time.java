class Solution {
    public class Pair {
            int node;
            int weight;
    
            public Pair(int node, int weight) {
                this.node = node;
                this.weight = weight;
            }
        }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>>adj=new ArrayList<>();
        int edges=times.length;
        for(int i=0;i<=n;i++)adj.add(new ArrayList<>());
        for(int node[]:times){
            int u=node[0],v=node[1],wt=node[2];
            adj.get(u).add(new Pair(v,wt));
        }
        int dis[]=new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(k);
        dis[k]=0;
        while(pq.size()>0){
            int node=pq.poll();
            for(Pair p:adj.get(node)){
                if(dis[p.node]>dis[node]+p.weight){
                   dis[p.node]=dis[node]+p.weight;
                   pq.add(p.node);
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++){
               if(dis[i]==Integer.MAX_VALUE)return -1;
               max=Math.max(max,dis[i]);
        }
        return max;

    }
}