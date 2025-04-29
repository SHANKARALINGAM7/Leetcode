class Solution {
    public long countSubarrays(int[] nums, int k) {
        
        long ans=0,count=0;
        int left = 0,right = 0,n=nums.length;
        int max=0;
        for(int num:nums)max=Math.max(max,num);
        while(right<n){
             if(nums[right]==max)count++;
             while(count==k){
                if(nums[left]==max)count--;
                    ans+=n-right;
                    left++;
             }
             right++;
        }

        return ans;
    }
}