class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        for(int i=0;i<(1<<nums.length);i++){
            int n=0;
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))>0)n^=nums[j];
            }
            sum+=n;
        }return sum;
    }
}