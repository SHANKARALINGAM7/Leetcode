class Solution {
    public int maxSum(int[] nums) {
        int arr[] = new int[101];
        int sum = 0 ;
        int count = 0 , max = Integer.MIN_VALUE;
        for(int i:nums){
            if(i>=0 && arr[i]==0){
                sum += i;
                arr[i]=1;
                count++;
            }
            else max =Math.max(max,i);
        }
        if(count==0)return max;
        return sum;
    }
}