class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int n=cost.length;
       int arr[]=new int[n];
       if(n==2)return Math.min(cost[0],cost[1]);
       Arrays.fill(arr,-1); 
       return Math.min(help(cost,n,arr,0),help(cost,n,arr,1));

    }
    public int help(int cost[],int n, int dp[],int i){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        int pick=cost[i]+help(cost,n,dp,i+1);
        int unpick=cost[i]+help(cost,n,dp,i+2);
        dp[i]=Math.min(pick,unpick);
        return dp[i];
    }
}