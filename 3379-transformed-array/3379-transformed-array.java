class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                result[i]=nums[(i+nums[i])%n];
            }
            else if(nums[i]<0){
                int steps=Math.abs(nums[i])%n;
                result[i]=nums[(i - steps + n) % n];
            }
            else{
                result[i]=nums[i];
            }
           
        }
        return result;
    }
}