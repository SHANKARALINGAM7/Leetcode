class Solution {
    int mod=1000000007;
    public int countGoodStrings(int low, int high, int zero, int one) {
        int dp[]=new int[100001];
        Arrays.fill(dp,-1);
        return help(0,low,high,zero,one,dp);

    }

    public int help(int str,int low,int high,int zero,int one,int []dp){
        if(str>high)return  0;
        if(dp[str]!=-1)return dp[str];
        int count=0;
        if(str<=high && str>=low){
           count=1 ;
        }
        int left=help(str+zero,low,high,zero,one,dp)%mod;
        int right=help(str+one,low,high,zero,one,dp)%mod;
        return dp[str]=(left+right+count)%mod;
    }
}