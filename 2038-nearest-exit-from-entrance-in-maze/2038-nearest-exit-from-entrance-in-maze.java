class Solution {
    public int nearestExit(char[][] maze, int[] en) {
        int row=maze.length,col=maze[0].length;
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        Queue<int[]>q=new LinkedList<>();
        maze[en[0]][en[1]]='+';
        for(int nxt[]:dir){
          int x=nxt[0]+en[0],y=nxt[1]+en[1];
          if(x>=0 && y>=0 && x<row && y<col && maze[x][y]=='.'){
                 q.add(new int[]{x,y,1});
                 if(x==0 || x==row-1 || y==0 || y==col-1)return 1;
                 maze[x][y]='+';
          }
        }
        while(q.size()>0){
            int pos[]=q.poll();
           for(int nxt[]:dir){
              int curX=pos[0]+nxt[0],curY=pos[1]+nxt[1],ct=pos[2];
              if(curX >=0 && curY>=0 && curX<row && curY<col && maze[curX][curY]=='.'){
                if(curX==0 || curX==row-1 || curY==0 || curY==col-1)return ct+1;
                  q.add(new int[]{curX,curY,ct+1});
                  maze[curX][curY]='+';

                  }
            }

        }
        return -1;
    }
}