class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=1;i<n;i++){
            int val=nums[i]&1;
            int val2=nums[i-1]&1;
            if(val==val2)arr[i]=1;
            else arr[i]=0;
            arr[i]+=arr[i-1];
        }
        boolean ans[]=new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            int n1=arr[queries[i][0]];
            int n2=arr[queries[i][1]];
            if(n1-n2==0)ans[i]=true;
            else ans[i]=false;
            
        }
        return ans;
    }
}