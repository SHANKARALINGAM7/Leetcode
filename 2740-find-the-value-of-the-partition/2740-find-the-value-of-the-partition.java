class Solution {
    public int findValueOfPartition(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
           ans = Math.min(ans,nums[i]-nums[i-1]);
        }
        return ans;
    }
}