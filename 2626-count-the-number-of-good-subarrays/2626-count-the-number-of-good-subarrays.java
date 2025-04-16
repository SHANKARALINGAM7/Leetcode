class Solution {
    public long countGood(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        long count=0,ans=0;
        int left=0,right=0,n=nums.length;
        while(left<n){
            hm.put(nums[left],hm.getOrDefault(nums[left],0)+1);
            int cur=hm.get(nums[left]);
            long pair=(cur*(cur-1)/2),rem=((cur-1)*(cur-2)/2);
            count+=pair-rem;
            int temp=right;
            while(count>=k){
                ans+=(n-left);
                int minus=hm.get(nums[right]);
                hm.put(nums[right],minus-1);
                long add=(minus*(minus-1)/2)-((minus-1)*(minus-2)/2);
                count-=add;
                right++;
            }
            left++;
        }
        return ans;
    }
}