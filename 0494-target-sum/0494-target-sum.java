class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int offset = 1000; // To handle negative sums
        int maxSum = 2000; // Range of sums (-1000 to 1000)
        
        // DP array: dp[index][sum]
        Integer[][] dp = new Integer[nums.length][maxSum + 1];
        
        return dfs(nums, target, 0, 0, dp, offset);
    }
    
    private int dfs(int[] nums, int target, int i, int sum, Integer[][] dp, int offset) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }
        
        // Check memoized result
        if (dp[i][sum + offset] != null) {
            return dp[i][sum + offset];
        }
        
        // Calculate ways by adding and subtracting the current number
        int add = dfs(nums, target, i + 1, sum + nums[i], dp, offset);
        int subtract = dfs(nums, target, i + 1, sum - nums[i], dp, offset);
        
        // Store the result in dp array
        dp[i][sum + offset] = add + subtract;
        return dp[i][sum + offset];
    }
}
