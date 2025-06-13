class Solution {
    public int helper(int a[],int k){
          int n = a.length;
          int count = 0;
          for(int i=1;i<n;i++){
             if(a[i]-a[i-1]<=k){
                 count++;
                 i++;
             }
          }

          return count;
        
    }
    public int minimizeMax(int[] arr, int p) {
        
        int n = arr.length;
        Arrays.sort(arr);
        int low = 0 , high = arr[n-1]-arr[0];
        int ans = 0;
        while(low<=high){

              int mid = low+(high-low)/2;
              if(helper(arr,mid)>=p){
                  ans = mid;
                  high = mid-1;
              }
              else low=mid+1;
        }

        return ans;
    }
}