class Solution {
    public int alternatingSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i%2==0) sum1+= nums[i];
            else sum2 += nums[i];
        }
        return sum1-sum2;
    }
}