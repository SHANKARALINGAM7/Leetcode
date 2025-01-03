class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0,prev=0;
        int n=nums.length,count=0;
        for(int i:nums)sum+=i;
        for(int i=0;i<n-1;i++){
            prev+=nums[i];
            if(prev>=sum-prev){
                count++;
            }
        }
        return count;
    }
}