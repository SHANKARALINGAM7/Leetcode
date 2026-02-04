class Solution {
    public long maxSum(List<Integer> li, int m, int k) {
        long ans = 0;
        
        int n = li.size();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = li.get(i);
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        long curSum = 0;
        for(int i=0;i<k;i++){
            curSum += nums[i];
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(int i=k;i<n;i++){
            // System.out.println(ans);
            if(hm.size() >= m){
                ans = Math.max(ans,curSum);
            }
             hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

             hm.put(nums[i-k],hm.get(nums[i-k])-1);
             curSum+= nums[i];
             curSum -= nums[i-k];
             if(hm.get(nums[i-k]) == 0)hm.remove(nums[i-k]);
        }

        if(hm.size() >= m){
                ans = Math.max(ans,curSum);
            }

        return ans;

    }
}