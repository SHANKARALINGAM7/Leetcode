class Solution {
    public boolean canPartition(int[] nums) {
        int tot=0,n=nums.length;
        for(int i:nums)tot+=i;
        if(tot%2==1)return false;
        int dp[][]=new int[n][tot/2];
        return help(nums,0,tot,0,dp)==1;
    }

    public int help(int nums[],int i,int tot,int cur,int dp[][]){
         
         if(i==nums.length && tot==2*cur)return 1;
         if(cur>=tot/2 || i>=nums.length)return -1;
         if(dp[i][cur]!=0)return dp[i][cur];
         int pick=help(nums,i+1,tot,cur+nums[i],dp);
         int unpick=help(nums,i+1,tot,cur,dp);
         dp[i][cur]=(pick==1||unpick==1)?1:-1;
         return dp[i][cur];
    }
}