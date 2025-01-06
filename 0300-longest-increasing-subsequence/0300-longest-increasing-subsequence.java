class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length,ans=1;
        int temp[]=new int[n];
        Arrays.fill(temp,1);
        for(int i=1;i<n;i++){
            int  max=0;
            for(int j=i;j>=0;j--){
                if(nums[i]>nums[j])max=Math.max(max,temp[j]);
            }
            temp[i]+=max;
            ans=Math.max(ans,temp[i]);
        }
           return ans;
    }
}