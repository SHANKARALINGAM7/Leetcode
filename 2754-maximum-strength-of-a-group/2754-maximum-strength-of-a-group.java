class Solution {
    public long maxStrength(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long pdt=1;
        long ans=Integer.MIN_VALUE;
        int i=0;
        while(i<n && nums[i]<0){
            pdt*=nums[i++];
            ans = Math.max(ans,pdt);
        }

        pdt = ans;
        if(pdt<=0)pdt=1;
        while(i<n){
            if(nums[i]==0){
                i++;
                continue;
            }
            pdt*=nums[i++];
            ans = pdt;
         }

         return Math.max(ans,nums[n-1]);

    }
}