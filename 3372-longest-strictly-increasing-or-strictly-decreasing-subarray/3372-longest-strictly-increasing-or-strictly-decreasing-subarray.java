class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=0,cti=0,ctd=0,n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                ctd=0;
                cti=0;
            }
            else if(nums[i-1]<nums[i]){
                cti++;
                ctd=0;
               
            }
            else {
                ctd++;
                cti=0;
            }
            max=Math.max(max,Math.max(ctd,cti));
        }
           return max+1;
    }
}