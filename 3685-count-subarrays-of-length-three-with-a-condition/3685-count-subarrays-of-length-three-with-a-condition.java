class Solution {
    public int countSubarrays(int[] arr) {
        int count=0,n=arr.length;
        for(int i=1;i<n-1;i++){
            if(arr[i]==2*(arr[i-1]+arr[i+1]))count++;
        }
        return count;
    }
}