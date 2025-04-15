class Solution {
    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        TreeMap<Integer,Integer>hm=new TreeMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int len=hm.size(),j=0;
        int arr[][]=new int[len][2];
        int dp[]=new int[len];
        for(int i:hm.keySet()){
            arr[j][0]=i;
            arr[j][1]=hm.get(i);
            j++;
        }
       return help(0,arr,dp);
    }

    public int help(int i,int nums[][],int dp[]){
        if(i>=nums.length)return 0;
        if(dp[i]!=0)return dp[i];
        int pick=0,unpick=0;
        if(i+1<nums.length && nums[i+1][0]!=nums[i][0]+1)pick=(nums[i][0]*nums[i][1])+help(i+1,nums,dp);
        else pick=(nums[i][0]*nums[i][1])+help(i+2,nums,dp);
        unpick=help(i+1,nums,dp);
        return dp[i]=Math.max(pick,unpick);
        
    }
}