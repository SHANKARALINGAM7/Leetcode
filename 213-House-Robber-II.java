class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0)l1.add(nums[i]);
            if(i!=n-1)l2.add(nums[i]);
        }
        return Math.max(help(l1,n-1),help(l2,n-1));
    }
    public int help(List<Integer>dp,int n){
         
        int prev=dp.get(0);
        if(n==1)return prev;
        int prev2=0;
        for(int i=1;i<n;i++){
            int take=dp.get(i);
            if(i>1)take+=prev2;
            int notTake=0+prev;
            int val=Math.max(take,notTake);
            prev2=prev;
            prev=val;
        }
        return prev;
    }
}