class Solution {
    public int numEnclaves(int[][] grid) {
        int row=grid.length,col=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i==0 || j==0|| i==row-1|| j==col-1)&&grid[i][j]==1){
                    q.add(new int[]{i,j});
                    grid[i][j]=2;
                }
            }
        }
        int path[][]={{-1,0},{1,0},{0,1},{0,-1}};
        while(q.size()>0){
            int arr[]=q.poll();
            for(int i=0;i<4;i++){
                int x=arr[0]+path[i][0],y=arr[1]+path[i][1];
                if(x<0 || y<0 ||x>=row || y>=col ||grid[x][y]!=1){
                      continue;
                }
                grid[x][y]=2;
                q.add(new int[]{x,y});
            }
        }
        int ct=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                   ct++;
                }
            }
        }
        return ct;
    }
}