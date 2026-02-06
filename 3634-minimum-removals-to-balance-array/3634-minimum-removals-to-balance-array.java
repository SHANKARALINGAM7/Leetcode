class Solution {
    public int minRemoval(int[] nums, int k) {
        int max = 0, n = nums.length;
        int left = 0;
        Arrays.sort(nums);
        for (int right = 0; right < n; right++) {
            while (left < right && nums[right] >( 1L*nums[left] * k)) {
                left++;
            }
            max = Math.max(max, right - left + 1);
        }

        return n - max;
    }
}