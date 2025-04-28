class Solution {
    public long countSubarrays(int[] nums, long k) {
        
        long ans = 0;
        int n = nums.length,i = 0,left = 0;
        long sum = 0;
        while(left<n){
            while(i<n && (sum+nums[i])*(i-left+1)<k){
                  sum += nums[i];
                  i++;
            }
            ans+=i-left;
            if(i==left)i++;
            else sum-=nums[left];            
            left++;
            
        }

          return ans; 
    }
}