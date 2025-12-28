class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long max = Long.MIN_VALUE;
        int mins[] = new int[n];
        mins[n-1] = nums[n-1];
        long sum = 0;
        
        for(int i=n-2;i>=0;i--){
            mins[i] = Math.min(mins[i+1],nums[i]);
        }

        for(int i=0;i<n-1;i++){
            sum += nums[i];
            max = Math.max(max,sum-mins[i+1]);
        }
        
        return max;

    }
}