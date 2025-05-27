class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
          int ans = 0;
          int low = 1;
          int high = 0;
          for(int i: nums)high=Math.max(high,i);
          while(low<=high){
             int mid = (high+low)/2;
             if(binary(nums,mid)<=threshold){
                    high=mid-1;
                    ans=mid;
              }
             else{
                 low=mid+1;
               }
          }
        
          return ans;
    }

    public int binary(int arr[], int num){
        int sum =0;
        for(int i:arr){
            sum += (i+num-1)/num;  // for nearest int do this like this (a+b-1)/b 
        }
        return sum;
    }
}