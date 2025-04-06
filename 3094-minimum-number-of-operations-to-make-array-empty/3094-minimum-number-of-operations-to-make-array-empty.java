class Solution {
    public int minOperations(int[] nums) {
          Arrays.sort(nums);
          int prev=nums[0],ct=1,ans=0,n=nums.length;
         for(int i=1;i<n;i++){
              if(prev!=nums[i]){
                        if(ct==1)return -1;
                        ans+=ct/3;
                        if(ct%3!=0)ans++;
                        ct=0;
              }
              ct++; 
              prev=nums[i];
         }
         if(ct==1)return -1;
         ans+=ct/3;
         if(ct%3!=0)ans++;
         return ans;
    }
}