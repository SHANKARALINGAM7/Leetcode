class Solution {
    public int absDifference(int[] nums, int k) {

        int left =0,right=0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<k;i++) left += nums[i];
        for(int i=n-1;i>=n-k;i--) right += nums[i];

        return right-left;

    }
}