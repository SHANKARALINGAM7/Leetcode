class Solution {
    public boolean canArrange(int[] arr, int k) {
     int arr1[] =new int[k];
     for(int i=0;i<arr.length;i++){
     int r= (arr[i]%k+k)%k;
     arr1[r]++;
      }
    if(arr1[0]%2!=0) return false;
    for(int i=1;i<=k/2;i++){
        if(arr1[i]!=arr1[k-i]) return false;
    }

    return true;
    }
}