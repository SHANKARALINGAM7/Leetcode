class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         int j=0,k=0,n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,pivot);
        for(int i:nums)if(i>pivot)k++;
        k=n-k;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot)ans[j++]=nums[i];
            else if(nums[i]>pivot)ans[k++]=nums[i];
        }
        return ans;

    }
}