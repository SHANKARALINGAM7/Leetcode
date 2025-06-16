class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int max = nums[n-1];
        int ans = 0;

        for(int i = n -1;i>=0;i--){
            ans = Math.max(ans,max-nums[i]);
            max = Math.max(max,nums[i]);
        }
        
        return ans != 0 ? ans : -1;
    }
}