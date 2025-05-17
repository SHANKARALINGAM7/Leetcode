class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[j] != 2 && nums[i]==2){
                nums[i] = nums[j];
                nums[j] = 2;
                i++;
                j--;
            }
            else if(nums[i] == 2) j--;
            else i++;
        }
        i=0;
        j=nums.length-1;
        while(i<j){
            if(nums[j] == 0 && nums[i] != 0){
                nums[j] = nums[i];
                nums[i] = 0;
                i++;
                j--;
            }
            else if(nums[j] == 0) i++;
            else j--;
        }

}
}