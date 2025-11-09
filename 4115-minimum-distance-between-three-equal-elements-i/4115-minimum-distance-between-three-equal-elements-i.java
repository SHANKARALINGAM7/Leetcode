class Solution {

    public int helper(int a[][], int i) {

        return Math.abs(a[i][0] - a[i][1]) + Math.abs(a[i][1] - a[i][2]) + Math.abs(a[i][2] - a[i][0]);
    }

    public int minimumDistance(int[] nums) {
        int arr[][] = new int[101][3];
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        boolean flag = true;

        for (int a[] : arr) {
            Arrays.fill(a, -1);
        }

        for (int i = 0; i < n; i++) {
            int val = nums[i];
            if (arr[val][0] == -1) {
                arr[val][0] = i;
            } else if (arr[val][1] == -1) {
                arr[val][1] = i;
            } else if (arr[val][2] == -1) {
                arr[val][2] = i;
                min = Math.min(min, helper(arr, val));
                flag = false;

            } else {
                arr[val][0] = arr[val][1];
                arr[val][1] = arr[val][2];
                arr[val][2] = i;
                min = Math.min(min, helper(arr, val));
            }
        }

        if (flag) {
            return -1;
        }

        return min;
    }

}