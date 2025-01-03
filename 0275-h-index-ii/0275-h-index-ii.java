class Solution {
    int ans=0;
    public int hIndex(int[] citations) {
        int n=citations.length;
        binarySearch(citations,0,n-1,n);
        return ans;
    }
    public void binarySearch(int arr[],int low,int high,int n){
      if(low<=high){
       int mid=(low+high)/2;
       if(n-mid<=arr[mid]){
        ans=Math.max(ans,n-mid);
        binarySearch(arr,low,mid-1,n);
       }
       else{
        binarySearch(arr,mid+1,high,n);
       }
     }
    }
}