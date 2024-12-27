class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        char s1[]=word1.toCharArray();
        char s2[]=word2.toCharArray();
        int dp[][]=new int[n][m];
        for(int[] arr:dp)Arrays.fill(arr,-1);
        return help(s1,s2,n-1,m-1,dp);
        
    }
    public int help(char s1[],char s2[],int i,int j,int dp[][]){
        if(i<0)return j+1;
        if(j<0)return i+1;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1[i]==s2[j])return dp[i][j]=0+help(s1,s2,i-1,j-1,dp);
        int insert=1+help(s1,s2,i-1,j,dp);
        int delete=1+help(s1,s2,i,j-1,dp);
        int replace=1+help(s1,s2,i-1,j-1,dp);

        return dp[i][j]=Math.min(insert,Math.min(replace,delete));
         
    }
}