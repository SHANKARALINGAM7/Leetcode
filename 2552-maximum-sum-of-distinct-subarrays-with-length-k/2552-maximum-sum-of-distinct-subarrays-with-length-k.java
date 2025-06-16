class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
         int max = 0;
         for(int i:nums){
            max = Math.max(max,i);
         } 
         int freq[] = new int[max+1];

         int count = 0 , left = 0, n= nums.length;
         long sum = 0 , ans = 0;
         for(int i = 0; i < n ;i++){
              if(freq[nums[i]]==1){
                  while(nums[left] != nums[i]){
                      sum -= nums[left];
                      freq[nums[left]]--;
                      count--;
                      left++;
                  }
                  sum -= nums[left];
                  freq[nums[left]]--;
                  count--;
                  left++;

              }
              freq[nums[i]]++;
              count++;
              sum += nums[i];
              if(count==k){
                  ans = Math.max(ans,sum);
                  sum -= nums[left];
                  freq[nums[left]]--;
                  left++;
                  count--;
              }
            //   System.out.println(sum +"  "+count);
         }

         return ans;
    }
}