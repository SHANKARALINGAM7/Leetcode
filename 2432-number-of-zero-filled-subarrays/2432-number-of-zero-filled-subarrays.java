class Solution {
    public long zeroFilledSubarray(int[] nums) {
          long ans = 0 ;
          int left = 0 , n = nums.length;
          for(int i=0;i<n;i++){
               if(nums[i] != 0 && nums[left]==0){
                    long  gap = i-left;
                    ans +=  gap*(gap+1)/2;
                    left=i;
               }
               else if(nums[left] != 0) left++;

          }
          if(left<n && nums[left]==0){
                    long  gap = n-left;
                    ans +=  gap*(gap+1)/2;
          }
          
          return ans;
    }
}