class Solution {
    public long maxScore(int[] nums, int x) {
        int n=nums.length;
        long dp[][]=new long[n][2];
        return nums[0]+help(1,x,nums,dp,nums[0]%2);
    }

    public long help(int i,int x,int nums[],long dp[][],int prev){
        if(i>=nums.length)return 0;
        if(dp[i][prev]!=0)return dp[i][prev];
        long cost = (nums[i]%2 == prev) ? 0 : x;

        long  pick1=nums[i]-cost+help(i+1,x,nums,dp,nums[i]%2);
        long  unpick=help(i+1,x,nums,dp,prev);
        return dp[i][prev]=Math.max(pick1,unpick);

    }
}