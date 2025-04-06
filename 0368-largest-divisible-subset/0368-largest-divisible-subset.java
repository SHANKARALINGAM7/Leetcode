class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.sort(nums);
        Arrays.fill(dp,1);
        int count=0;
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=i-1;j>=0;j--){
                 if(nums[i]%nums[j]==0)max=Math.max(max,dp[j]);
            }
            dp[i]+=max;
            count=Math.max(count,dp[i]);
        }
        int prev=-1;
        // System.out.println(count);
        for(int j=n-1;j>=0;j--){
            if(dp[j]==count && (prev==-1 || prev%nums[j]==0)){
                l.add(nums[j]);
                prev=nums[j];
                count--;
            }
        }
        Collections.reverse(l);
        return l;
        
    }
}