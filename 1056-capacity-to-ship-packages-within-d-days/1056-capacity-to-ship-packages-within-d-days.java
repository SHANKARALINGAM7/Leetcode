class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        for (int i : weights)
            sum += i;
        int low = 1, high = sum;
        int ans = 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (helper(weights, mid) <= days) {
                high = mid - 1;
                ans = mid;
            } 
            else
                low = mid + 1;
        }
        return ans;
    }

    public int helper(int arr[], int k) {
        int count = 1, sum = 0;
        for (int i : arr) {
            if(i>k)return Integer.MAX_VALUE;
            sum += i;
            if (sum > k) {
                count++;
                sum = i;
            }
        }
        return count;
    }
}