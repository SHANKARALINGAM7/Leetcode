class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
          
         help(nums,target,nums.length,0,0);
         return count;
    }

    public void help(int nums[],int target,int n,int i,int sum){

        if(i>n)return;
        if(i==n){
            if(sum==target)count++;
            return ;
        }
        help(nums,target,n,i+1,sum+nums[i]);
        help(nums,target,n,i+1,sum-nums[i]);
    }
}