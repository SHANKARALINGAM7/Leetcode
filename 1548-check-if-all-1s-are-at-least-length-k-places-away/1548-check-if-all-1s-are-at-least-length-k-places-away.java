class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n =  nums.length;
        int prev = -1;
         for(int i=0;i<n;i++){
             if(prev == -1 && nums[i] == 1){
                 prev = i;
             }
             else if(nums[i] ==1){
                  if(i-prev-1<k)return false;
                  prev = i;
             }
         }
         return true;
    }
}