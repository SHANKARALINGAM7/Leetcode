class Solution {
    public int minimumDeleteSum(String st1, String st2) {
        int n=st1.length(),m=st2.length();
        char s1[]=st1.toCharArray();
        char s2[]=st2.toCharArray();
        int dp[][]=new int[n][m];
        for(int[] arr:dp)Arrays.fill(arr,-1);
        return help(s1,s2,n-1,m-1,dp);
    }
    public int help(char s1[],char s2[],int i, int j,int dp[][]){
        if(i<0){
            int sum=0;
            for(int k=j;k>=0;k--)sum+=(int)(s2[k]);
            return sum;
        }
        if(j<0){
            int sum=0;
            for(int k=i;k>=0;k--)sum+=(int)(s1[k]);
            return sum;
        }

        if(dp[i][j]!=-1)return dp[i][j];
        if(s1[i]==s2[j])return dp[i][j]=help(s1,s2,i-1,j-1,dp);
        int del1=(int)(s1[i])+help(s1,s2,i-1,j,dp);
        int del2=(int)(s2[j])+help(s1,s2,i,j-1,dp);
        return dp[i][j]=Math.min(del1,del2);

    }
}