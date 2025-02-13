class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]!=0)return -1;
        int row=grid.length,col=grid[0].length;
        if(row==1 && col==1 && grid[0][0]==0)return 1;
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{0,0,1});
        grid[0][0]=1;
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1},{1,1},{1,-1},{-1,1},{-1,-1}};
        while(q.size()>0){
             int len=q.size();
             for(int i=0;i<len;i++){
                int a[]=q.poll();
                for(int j=0;j<8;j++){
                    int x=a[0]+dir[j][0];
                    int y=a[1]+dir[j][1];
                    if(x>=0 && y>=0 && x<row && y<col && grid[x][y]==0){
                         if(x==row-1 && y==col-1)return a[2]+1;
                        q.add(new int[]{x,y,a[2]+1});
                        grid[x][y]=1;
                    }
                }
             }
        }
        return -1;
    }
}