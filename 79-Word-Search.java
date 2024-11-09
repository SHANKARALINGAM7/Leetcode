class Solution {

    public boolean exist(char[][] board, String word) {
         int row=board.length,col=board[0].length,n=word.length();
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans=help(board,word,i,j,row,col,0,n);
                    if(ans)return true;
                }
            }
         }
         return false;
    }
    public boolean help(char[][] grid,String word,int i, int j,int row, int col,int idx,int len){
        
        if(i<0 ||i>=row ||j<0 ||j>=col || grid[i][j]!=word.charAt(idx))return false;
        if(idx==len-1)return true;
        char t=grid[i][j];
        grid[i][j]='0';
        boolean up=help(grid,word,i-1,j,row,col,idx+1,len)||
        help(grid,word,i,j+1,row,col,idx+1,len)||
        help(grid,word,i+1,j,row,col,idx+1,len)||
        help(grid,word,i,j-1,row,col,idx+1,len);
        grid[i][j]=t;
        return up;
    }
}