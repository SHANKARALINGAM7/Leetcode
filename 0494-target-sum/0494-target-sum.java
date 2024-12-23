class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int offset = 1000; 
        int maxSum = 2000; 
        
        Integer[][] dp = new Integer[nums.length][maxSum + 1];
        
        return dfs(nums, target, 0, 0, dp, offset);
    }
    
    private int dfs(int[] nums, int target, int i, int sum, Integer[][] dp, int offset) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }
        if (dp[i][sum + offset] != null) {
            return dp[i][sum + offset];
        }
        
        int add = dfs(nums, target, i + 1, sum + nums[i], dp, offset);
        int subtract = dfs(nums, target, i + 1, sum - nums[i], dp, offset);
        
        dp[i][sum + offset] = add + subtract;
        return dp[i][sum + offset];
    }
}
