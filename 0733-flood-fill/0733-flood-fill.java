class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row=image.length,col=image[0].length,start=image[sr][sc];
        int vis[][]=new int[row][col];
        Queue<int[]>q=new LinkedList<>();
         vis[sr][sc]=-1;
         q.add(new int[]{sr,sc});
         image[sr][sc]=color;
        int path[][]={{-1,0},{1,0},{0,1},{0,-1}};
        while(q.size()>0){
            int node[]=q.poll();
            int x=node[0],y=node[1];
            image[x][y]=color;
            for(int i=0;i<4;i++){
                 int a=x+path[i][0];
                 int b=y+path[i][1];
                 if(a<0 || b<0 || a>=row || b>=col||vis[a][b]==-1 ||image[a][b]!=start)continue;
                //  System.out.println(x+" "+y);
                 q.add(new int[]{a,b});
                 vis[a][b]=-1;
            }
            
        }
        return image;
    }
}