class Solution {
    // int vis[][];
    public int getMaximumGold(int[][] grid) {
        int row=grid.length,col=grid[0].length;
        int max=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]!=0){
                    max=Math.max(max,dfs(grid,i,j,row,col));
                }
            }
        }
        return max;
    }

    public int dfs(int grid[][],int i,int j,int row,int col){
        if(i<0 || j<0 ||i>=row || j>=col || grid[i][j]==0){
               return 0;
        }
        int cur=grid[i][j];
        grid[i][j]=0;
        int max= cur+Math.max(dfs(grid,i+1,j,row,col),Math.max(dfs(grid,i-1,j,row,col),
                        Math.max(dfs(grid,i,j+1,row,col),dfs(grid,i,j-1,row,col))));
        grid[i][j]=cur;
        return max;
    }
}