class Solution {
    int count=0;
    public int findMaxFish(int[][] grid) {
        int max=0,row=grid.length,col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]!=0){
                    dfs(grid,i,j,row,col);
                    max=Math.max(max,count);
                    count=0;
                }
            }
        }
        return max;
    }

    public void dfs(int grid[][],int i,int j,int row,int col){
        if(i<0||j<0||i>=row||j>=col||grid[i][j]==0)return ;
        count+=grid[i][j];
        grid[i][j]=0;
        dfs(grid,i+1,j,row,col);
        dfs(grid,i,j+1,row,col);
        dfs(grid,i-1,j,row,col);
        dfs(grid,i,j-1,row,col);

    }
}