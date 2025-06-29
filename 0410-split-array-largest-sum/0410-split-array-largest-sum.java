class Solution {
    public int splitArray(int[] arr, int k) {
        int n = arr.length;
        long low = 0, high = 0;
        for (int i = 0; i < n; i++) {
            low = Math.max(arr[i], low);
            high += arr[i];
        }
        int ans = 0;
        while (low <= high) {
            long mid = (high + low) / 2;
            if (helper(arr, mid) <= k) {
                high = mid - 1;
                ans = (int) mid;
            } else
                low = mid + 1;
        }

        return ans;
    }

    public int helper(int arr[], long k) {
        int count = 1;
        long sum = 0;
        for (int num : arr) {
            if (sum + num > k) {
                count++;
                sum = num;
            } else {
                sum += num;
            }
        }
        return count;
    }
}