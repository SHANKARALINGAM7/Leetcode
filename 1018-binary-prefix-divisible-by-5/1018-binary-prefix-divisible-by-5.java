class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>l=new ArrayList<>();
         int ans=0,prev=0;
        for(int i=0;i<nums.length;i++){
            prev=prev%10;
            if(nums[i]==0){
                ans=prev*2;
                prev=ans;
            }
            else{
                ans=prev*2+1;
                prev=ans; 
            }
            l.add(ans%5==0);
        }
        return l;
    }
}