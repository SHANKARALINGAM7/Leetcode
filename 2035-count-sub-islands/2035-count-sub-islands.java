class Solution {
    boolean isIsland=true;
    public int countSubIslands(int[][] grid1, int[][] grid2) {

        int row=grid1.length,col=grid1[0].length,count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              if(grid2[i][j]==1){
                dfs(i,j,grid1,grid2);
                if(isIsland)count++;
                isIsland=true;
               }
            }
        }
        return count;
    }

    public void dfs(int i,int j,int[][] grid1,int[][] grid2){
        if(i<0 || j<0 ||i>=grid1.length || j>=grid1[0].length ||grid2[i][j]==0){
               return ;
        }
        if(grid1[i][j]==0){
            isIsland=false;
            return;
        }
        grid2[i][j]=0;
        dfs(i+1,j,grid1,grid2);
        dfs(i-1,j,grid1,grid2);
        dfs(i,j+1,grid1,grid2);
        dfs(i,j-1,grid1,grid2);
    }
}