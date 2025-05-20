class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int temp[] = new int[n+1];
        for(int a[] : queries){
            temp[a[0]]++;
            temp[a[1]+1]--;
        }
        for(int i=1;i<n;i++){
            temp[i] += temp[i-1];
        }
        for(int i=0;i<n;i++){
              if(nums[i]>temp[i])return false;
        }
        return true;
    }
}