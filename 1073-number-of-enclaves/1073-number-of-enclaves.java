class Solution {
    public void dfs(int[][] grid,int i,int j){
        if(i<0 || j<0 ||i>=grid.length || j>=grid[0].length ||grid[i][j]!=1){
                      return;
                }
         grid[i][j]=2;
         dfs(grid,i-1,j);
          dfs(grid,i+1,j);
           dfs(grid,i,j-1);
           dfs(grid,i,j+1);
            
    }
    public int numEnclaves(int[][] grid) {
        int row=grid.length,col=grid[0].length;
        //Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<row;i++){
             if(grid[i][0]==1){
                dfs(grid,i,0);
             }
        }
        for(int i=0;i<row;i++){
             if(grid[i][col-1]==1){
                 dfs(grid,i,col-1);
             }
        }
        for(int i=0;i<col;i++){
             if(grid[0][i]==1){
                 dfs(grid,0,i);
             }
        }
        for(int i=0;i<col;i++){
             if(grid[row-1][i]==1){
                 dfs(grid,row-1,i);
             }
        }
       
        // int path[][]={{-1,0},{1,0},{0,1},{0,-1}};
        // while(q.size()>0){
        //     int arr[]=q.poll();
        //     for(int i=0;i<4;i++){
        //         int x=arr[0]+path[i][0],y=arr[1]+path[i][1];
        //         if(x<0 || y<0 ||x>=row || y>=col ||grid[x][y]!=1){
        //               continue;
        //         }
        //         grid[x][y]=2;
        //         q.add(new int[]{x,y});
        //     }
        // }
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