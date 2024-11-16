class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!check(board,i,j))return false;
                }
            }
        }
        return true;
    }
    public boolean check(char ch[][],int r,int c){
        Set<Character> row=new HashSet<>();
        Set<Character> col=new HashSet<>();
        Set<Character> mat=new HashSet<>();

        for(int i=0;i<9;i++){
           if(ch[r][i]!='.' && !row.add(ch[r][i]))return false;
           if(ch[i][c]!='.' && !col.add(ch[i][c]))return false;

           char c1=ch[3*(r/3)+i/3][3*(c/3)+i%3];
           if(c1!='.' && !mat.add(c1))return false;
        }
        return true;
    }
}