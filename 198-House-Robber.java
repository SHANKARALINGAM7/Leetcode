class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);
        int arr[]=new int[n];
        Arrays.fill(arr,-1);
        return help(nums,n-1,arr);
    }
    static int help(int [] nums,int i,int visited[]){
        if(i==0){
            return nums[0];
        }
        if(i<0)return 0;
        if(visited[i]!=-1)return visited[i];
        int pick=nums[i]+help(nums,i-2,visited);
        int unpick=0+help(nums,i-1,visited);
        visited[i]=Math.max(pick,unpick) ;
        return visited[i];
    }
}