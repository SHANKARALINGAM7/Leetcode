class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        Integer dp[] = new Integer[n];
        return helper(0, nums, dp);
    }

    public int helper(int i, int arr[], Integer dp[]) {
        if (i >= arr.length)
            return 0;
        if (dp[i] != null)
            return dp[i];

        int pick = arr[i] + helper(i + 2, arr, dp);
        int unpick = helper(i + 1, arr, dp);

        return dp[i] = Math.max(pick, unpick);
    }
}