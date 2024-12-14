class Solution {
    public long continuousSubarrays(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,l=0,r=0,n=nums.length;
        long count=0,sum=0;
        while(r<n){
            min=Math.min(min,nums[r]);
            max=Math.max(max,nums[r]);
            if(max-min>2){
                sum=r-l;
                count+=sum*(sum+1)/2;
                max=min=nums[r];
                l=r;
                while(Math.abs(nums[l-1]-nums[r])<=2){
                      l--;
                      min=Math.min(min,nums[l]);
                      max=Math.max(max,nums[l]);
                     
                }
                
                sum=r-l;
                if(sum!=0)count-=sum*(sum+1)/2;
            }
            r++;
        }
                sum=r-l;
                count+=sum*(sum+1)/2;
      
        return count;
    }
}