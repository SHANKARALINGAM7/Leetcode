class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = Integer.MAX_VALUE; 
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canDivide(nums, maxOperations, mid)) {
                result = mid; 
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }

        return result;
    }

    private boolean canDivide(int[] nums, int maxOperations, int maxPenalty) {
        int operations = 0;

        for (int num : nums) {
            if (num > maxPenalty) {
                operations += (num - 1) / maxPenalty;
                if (operations > maxOperations) {
                    return false; 
                }
            }
        }

        return true; 
    }
}
