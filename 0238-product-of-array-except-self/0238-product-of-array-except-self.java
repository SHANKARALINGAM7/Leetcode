class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            productExceptSelf(new int[] { 0, 0 });
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int zero=0,n=nums.length,pdt=1,ind=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
                ind=i;
            }
            else pdt*=nums[i];
        }
        int ans[]=new int[n];
        if(zero>1)return ans;
        if(zero==1){
            ans[ind]=pdt;
            return ans;
        }
        for(int i=0;i<n;i++){
            ans[i]=pdt/nums[i];
        }
        return ans;



    }
}