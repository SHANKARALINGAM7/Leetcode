class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
          
         help(nums,target,nums.length-1,0);
         return count;
    }

    public void help(int nums[],int target,int i,int sum){

        if(i<-1)return;
        if(i==-1){
            if(sum==target)count++;
            return ;
        }
        help(nums,target,i-1,sum+nums[i]);
        help(nums,target,i-1,sum-nums[i]);
    }
}