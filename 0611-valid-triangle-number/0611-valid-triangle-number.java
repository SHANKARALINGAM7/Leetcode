class Solution {
    public int triangleNumber(int[] nums) {
        int count  = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                      if(nums[i]+nums[j]<=nums[k])break;
                      count++;
                }
            }
        }
        return count;
    }
}