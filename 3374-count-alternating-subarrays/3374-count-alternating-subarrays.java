class Solution {
    long factorial[] = new long[100001];  
    public void fact(int n){
       factorial[1] = 1;
       for(int i=2;i<=n;i++){
             factorial[i] = factorial[i-1] + i;
       }
    }

    public long countAlternatingSubarrays(int[] nums) {
        long ans = 0;
        
        int n = nums.length , left = 0;
        fact(n);
        for(int i=1;i<n;i++){
             if(nums [i] == nums[i-1]){
                ans += factorial[i-left];
                left = i;
             }
        }
        ans += factorial[n-left];
      
        return ans;
    }
}