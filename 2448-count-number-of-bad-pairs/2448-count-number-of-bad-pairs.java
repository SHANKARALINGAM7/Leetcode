class Solution {
    public long calculate(long n){
        return (long)n*(n-1)/2;
    }
    public long countBadPairs(int[] nums) {
        long n=nums.length;
        HashMap<Integer,Long>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i]-i,hm.getOrDefault(nums[i]-i,0L)+1);
        }
        long tot=calculate(n);
        long bad=0;
        for(int i:hm.keySet()){
            if(hm.get(i)>1)
            bad+=calculate(hm.get(i));
        }

        return tot-bad;
        
    }
}