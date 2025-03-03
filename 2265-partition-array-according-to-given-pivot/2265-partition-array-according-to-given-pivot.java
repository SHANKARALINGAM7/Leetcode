class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
         int j=0,count=0,n=nums.length;
        int ans[]=new int[n];
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<pivot)ans[j++]=nums[i];
            else if(nums[i]>pivot)l.add(nums[i]);
            else count++;
        }
        
        for(int i=0;i<count;i++)ans[j++]=pivot;
        for(int i:l)ans[j++]=i;
        return ans;

    }
}