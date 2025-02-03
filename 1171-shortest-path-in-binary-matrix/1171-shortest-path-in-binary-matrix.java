class Solution {
    public class Pair {
        int node;
        int weight;

        public Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int ct=0,row=grid.length,col=grid[0].length;
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{1,1},{1,-1},{-1,1}};
        List<List<Pair>>adj=new ArrayList<>();
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0)ct++;
            }
        }
        for(int i=0;i<row*col;i++)adj.add(new ArrayList<>());
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    for(int nxt[]:dir){
                        int x=nxt[0]+i;
                        int y=nxt[1]+j;
                        if(x>=0 && y>=0 && x<row && y<col && grid[x][y]==0){
                              int u=(col*i)+j;
                              int v=(col*x)+y;
                              adj.get(u).add(new Pair(v,1));
                        }
                    }
                }
            }
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        if(grid[0][0]!=0)return -1;
        pq.add(0);
        int dis[]=new int[row*col];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[0]=1;
        while(pq.size()>0){
            int node=pq.poll();
            for(Pair p:adj.get(node)){
                if(dis[p.node]>dis[node]+p.weight){
                    dis[p.node]=dis[node]+p.weight;
                    pq.add(p.node);
                }
            }
        }
        if(dis[(row*col)-1]==Integer.MAX_VALUE)return -1;
        return dis[(row*col)-1];
    }
}