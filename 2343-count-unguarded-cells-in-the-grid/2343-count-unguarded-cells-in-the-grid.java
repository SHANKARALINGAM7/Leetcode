class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        int[][] grid=new int[m][n];
        for(int ar[]:walls){
             grid[ar[0]][ar[1]]=-1;
        }
        for(int ar[]:guards){
            grid[ar[0]][ar[1]]=-1;
        }
        
        int path[][]={{-1,0},{1,0},{0,-1},{0,1}};
        for(int guard[]:guards){
            int i=guard[0],j=guard[1];
            for(int[] ar:path){
                        int x=ar[0]+i,y=ar[1]+j;  
                        while(x>=0 && y>=0 && x<m && y<n ){
                                  if(grid[x][y]==-1)break;
                                  grid[x][y]=2;
                                  x=ar[0]+x;
                                  y=ar[1]+y;
                        }
                       }
        }
         int count=0;
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) if(grid[i][j]==0)count++;
         }
         return count;

       
    }
}