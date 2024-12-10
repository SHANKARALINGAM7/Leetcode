class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0,ct=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]+1) == nums[i+1]){
                ct++;
            }
            else if(nums[i+1]==nums[i]){
                    continue;
            }
            else{
                max=Math.max(max,ct);
                ct=1;
            }
        }
        max=Math.max(max,ct);
        return nums.length>0?max:0;
    }
}