class Solution {
    public int minimumOperations(int[] nums) {
        int arr[]=new int[101];
        int n=nums.length,j=0;
        for(int i=n-1;i>=0;i--){
           if(arr[nums[i]]!=0)break;
           arr[nums[i]]=1;
           j++;
        }
        int rem=n-j;
        int ans=rem/3;
        if(rem%3!=0)ans++;
        return ans;
    }
}