class Solution {
   
    public long countAlternatingSubarrays(int[] nums) {
        long ans = 0;
        
        int n = nums.length , left = 0;
        for(int i=1;i<n;i++){
             if(nums [i] == nums[i-1]){
                long k = i-left;
                ans += (k*(k+1))/2;
                left = i;
             }
        }
         long k = n-left;
         ans += (k*(k+1))/2;   
        return ans;
    }
}