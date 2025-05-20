class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length ,sum = 0;
        int temp[] = new int[n+1];
        for(int a[] : queries){
            temp[a[0]]++;
            temp[a[1]+1]--;
        }
        for(int i=0;i<n;i++){
            sum += temp[i];
            if(nums[i]>sum)return false;
        }
        return true;
    }
}