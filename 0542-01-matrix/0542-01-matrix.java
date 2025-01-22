class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row=mat.length,col=mat[0].length;
        int[][] vis=new int[row][col];
        Queue<int[]>q=new LinkedList<>();
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                 q.add(new int[]{i,j});
                 vis[i][j]=-1; 
                }
                }
            }
         
         return bfs(mat,q,vis);
    }

    public int[][] bfs(int[][]mat,Queue<int[]>q,int vis[][]){
       int path[][]={{-1,0},{1,0},{0,1},{0,-1}};
       int ct=0;
       while(q.size()>0){
        int n=q.size();
        for(int i=0;i<n;i++){
            int node[]=q.poll();
            int a=node[0],b=node[1];
            for(int k=0;k<4;k++){
              int x=a+path[k][0];
              int y=b+path[k][1];
               if(x<0 || y<0 ||x>=mat.length || y>=mat[0].length||vis[x][y]==-1)continue;
                mat[x][y]+=ct;
                q.add(new int[]{x,y});
                vis[x][y]=-1; 
            }
        }
        ct++;
       }
       return mat;
    }
}