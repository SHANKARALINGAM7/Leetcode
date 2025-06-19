class Solution {
    public int partitionArray(int[] arr, int k) {
        Arrays.sort(arr);
        int count = 1;
        int min = arr[0] , n = arr.length;
        for(int i=0;i<n-1;i++){
               if(arr[i+1]-min>k){
                   count++;
                   min = arr[i+1];
               }
        }
        return count;
    }
}