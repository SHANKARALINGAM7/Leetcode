class Solution {
    public int maxAscendingSum(int[] nums) {
    int max=0,sum=nums[0],n=nums.length;
    for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                max=Math.max(max,sum);
                sum=0;
            }
            sum+=nums[i];
     }
     max=Math.max(max,sum);
     return max;
    }
}