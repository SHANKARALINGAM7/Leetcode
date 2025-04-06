class Solution {
    public int minOperations(int[] nums) {
           int arr[]=new int[1000001];
           for(int i:nums){
               arr[i]++;
           }
           int count=0;
           for(int i:arr){
                if(i!=0){
                if(i==1)return -1;
                count+=i/3;
                if(i%3!=0)count++;
                }
           }
           return count;
    }
}