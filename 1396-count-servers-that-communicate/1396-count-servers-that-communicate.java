class Solution {
    public int countServers(int[][] grid) {
        int row=grid.length,col=grid[0].length,ans=0;
        int r[]=new int[row];
        int c[]=new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    r[i]++;
                    c[j]++;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1 && (r[i]>1 || c[j]>1)){
                    ans++;
                }
            }
        }
        return ans;
    }

}