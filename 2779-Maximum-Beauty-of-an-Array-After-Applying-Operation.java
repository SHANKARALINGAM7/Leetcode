class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int max=0;
        for(int i:nums)max=Math.max(max,i);
        int arr[]=new int[max+2+k];
         for(int i:nums){
            if(i-k<0)arr[0]++;
            else arr[i-k]++;
            arr[i+k+1]--;
         }
         int sum=0;
         max=0;
         for(int i:arr){
            sum+=i;
            max=Math.max(max,sum);
         }
        return max;
    }
}