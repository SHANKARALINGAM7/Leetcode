class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         long pdt = 1;
         int left = 0 , n = nums.length;
         int count = 0;
        //  if(k==0)return 0;
         for(int right =0;right<n;right++){
             pdt *= nums[right];
             while(left <= right && pdt>=k){
                   pdt /= nums[left];
                   left++;
             }
             count += right-left+1;
         }
         return count;

    }
}