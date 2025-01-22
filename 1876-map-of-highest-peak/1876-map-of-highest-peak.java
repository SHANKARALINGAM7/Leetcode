class Solution {
    public int[][] highestPeak(int[][] grid) {
        int row=grid.length,col=grid[0].length;
        int vis[][]=new int[row][col];
        Queue<int[]>q=new LinkedList<>();
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    q.add(new int[]{i,j});
                    vis[i][j]=-1;
                }
                else grid[i][j]=1;
            }
        }
        return bfs(grid,q,row,col,vis);
    }
    public int[][] bfs(int arr[][],Queue<int[]>q,int row,int col,int[][]vis){
        int side[][]={{-1,0},{1,0},{0,1},{0,-1}};
        while(q.size()>0){
            int sz=q.size();
            
        for(int ii=0;ii<sz;ii++){
            int[] node=q.poll();
            int i=node[0],j=node[1];
        for(int k=0;k<4;k++){
            int x=i+side[k][0],y=j+side[k][1];
             if(x<0 || y<0 ||x>=arr.length ||y>=arr[0].length ||vis[x][y]==-1)continue;
             arr[x][y]+=arr[i][j];
             vis[x][y]=-1;
             q.add(new int[]{x,y});

        }
     }
}
        return arr;
    }
}