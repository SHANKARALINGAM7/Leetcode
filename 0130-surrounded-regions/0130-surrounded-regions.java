class Solution {
    public void solve(char[][] board) {
        Queue<int[]>q=new LinkedList<>();
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 || j==0 ||i==row-1||j==col-1){
                    if(board[i][j]=='O'){
                        q.add(new int[]{i,j});
                        board[i][j]='#';
                    }
                }
            }
        }
        int path[][]={{-1,0},{1,0},{0,-1},{0,1}};
        while(q.size()>0){
            int node[]=q.poll();
            int ii = node[0];
            int jj = node[1];
            for(int i=0;i<4;i++){
                int r1 = ii + path[i][0];
                int c1 = jj + path[i][1];
                if(r1>=0 && r1<row && c1>=0 && c1<col && board[r1][c1]=='O'){
                    q.add(new int[]{r1,c1});
                    board[r1][c1] = '#';
                }
            }
            
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j]=='#'){
                    board[i][j] = 'O';
                } 
            }
        }
    }
}