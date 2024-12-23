class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0,prev=0,n=nums.length;
        for(int i:nums)sum+=i;
        for(int i=0;i<n;i++){
          if(prev==sum-prev-nums[i])return i;
          prev+=nums[i];
        }
        return -1;
    }
}