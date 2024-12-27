class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length();
        char s1[]=text1.toCharArray();
        char s2[]=text2.toCharArray();
        int dp[][]=new int[n][m];
        for(int[] arr:dp)Arrays.fill(arr,-1);
        return help(s1,s2,n-1,m-1,dp);

    }

    public int help(char s1[],char s2[],int i, int j,int dp[][]){
        if(i<0||j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1[i]==s2[j])return dp[i][j]=1+help(s1,s2,i-1,j-1,dp);
        int move1=help(s1,s2,i-1,j,dp);
        int move2=help(s1,s2,i,j-1,dp);
        return dp[i][j]=Math.max(move1,move2);
    }
}