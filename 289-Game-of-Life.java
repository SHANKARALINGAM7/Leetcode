class Solution {
    public void gameOfLife(int[][] board) {
        int row=board.length,col=board[0].length;
        int temp[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)temp[i][j]=board[i][j];
        }
         int turn=0;
         int pos[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 int count=0;
                 if(board[i][j]==1)turn=1;
                 else turn=0;
                for(int k=0;k<8;k++){
                    int I=i+pos[k][0];
                    int J=j+pos[k][1];
                    if(I>=0&&I<row && J>=0 && J<col&&temp[I][J]==1)count++;
                  
                }
                if(turn==0 && count==3)board[i][j]=1;
                if(turn==1 &&(count<=1 ||count>3)){
                    board[i][j]=0;
                }
            }
        }

    }
}