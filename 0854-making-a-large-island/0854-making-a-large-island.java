class Solution {
    public int bfs(int i,int j,int grid[][],int vis[][],int f){
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{i,j});
        int res=1;
        vis[i][j]=f;
        int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
        while(q.size()>0){
            int arr[]=q.poll();
            int x=arr[0],y=arr[1];
          for(int k=0;k<4;k++){
            int a=x+dir[k][0],b=y+dir[k][1];
              if(a>=0 && b>=0 && a<grid.length && b<grid[0].length && vis[a][b]==0 &&grid[a][b]==1){
                vis[a][b]=f;
                q.add(new int[]{a,b});
                res++;
            }
         }
       
    }
        return res;
}
    public int largestIsland(int[][] grid) {
        int max=0,row=grid.length,col=grid[0].length,ct=0,f=-1;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int vis[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int land=0;
                if(grid[i][j]==1 && vis[i][j]==0){
                    ct++;
                  land=bfs(i,j,grid,vis,f);
                  if(land==row*col)return land;
                  hm.put(f,land);
                  f--;
                }
            }
        }
    int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                   int  sum=0;
                   Set<Integer> set=new HashSet<>();
                  for(int k=0;k<4;k++){
                   int a=i+dir[k][0],b=j+dir[k][1];
                    if(a>=0 && b>=0 && a<grid.length && b<grid[0].length && vis[a][b]!=0 && set.add(vis[a][b])){
                          sum+=hm.get(vis[a][b]);
                      }

                    }
                    max=Math.max(max,1+sum);
                }
            }
        }
                return max;
    }
}