class Solution {
    public int orangesRotting(int[][] grid) {
        int count=0,row=grid.length,col=grid[0].length,zero=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    grid[i][j]=0;
                 }
                 else if(grid[i][j]==0)zero++;
            }
        }
        if(zero==row*col)return 0;
        int path[][]={{-1,0},{1,0},{0,1},{0,-1}};
        while(q.size()>0){
          int num=q.size();
           for(int j=0;j<num;j++){
            int rot[]=q.poll();
            int a=rot[0],b=rot[1];
            for(int i=0;i<4;i++){
                int x=path[i][0]+a,y=path[i][1]+b;
                 
                if(x<row && x>=0 && y>=0 && y<col  &&grid[x][y]!=0){
                 //   System.out.println(x+" "+y);
                    q.add(new int[]{x,y});
                    grid[x][y]=0;
                }
            }
           }
            count++;
          //  System.out.println(count);
            
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 if(grid[i][j]!=0)return -1;
                
            }
        }
        return count-1;
    }
}