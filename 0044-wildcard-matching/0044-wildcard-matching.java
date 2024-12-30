class Solution {
    public boolean isMatch(String s, String p) {
        char[] s2 = s.toCharArray();
        char[] s1 = p.toCharArray();
        int[][] dp = new int[p.length()][s.length()];
        return help(s1, s2, p.length()-1, s.length()-1, dp) == 1;
    }

    public int help(char[] s1, char[] s2, int i, int j, int[][] dp) {
        if(i<0 && j<0)return 1;
        if(i<0 && j>=0)return -1;
        if(i>=0 && j<0){
            for(int k=0;k<=i;k++){
                if(s1[k]!='*')return -1;
            }
            return 1;
        }
        if(dp[i][j]!=0)return dp[i][j];
        if(s1[i]==s2[j]||s1[i]=='?')return dp[i][j]=help(s1,s2,i-1,j-1,dp);
        else if(s1[i]=='*')return dp[i][j]=help(s1,s2,i,j-1,dp)==1||help(s1,s2,i-1,j,dp)==1?1:-1;
        return dp[i][j]=-1;
    }
}
