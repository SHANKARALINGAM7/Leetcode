class Solution {
    public int minDays(int[] arr, int m, int k) {       
         int n = arr.length;
         if(m*k>n)return -1;

         int low =arr[0], high =arr[0];
         for(int i=0;i<n;i++){
            low = Math.min(arr[i],low);
            high =Math.max(arr[i],high);
         }
         int ans = -1;
         while(low <= high){
              int mid = (high+low)/2;
              int canDo = helper(arr,k,mid);
              if(canDo>=m){
                  ans = mid;
                  high = mid-1;
              }
              else low = mid+1;
         }
         return ans;
    }

    public int helper(int arr[],int k,int val){
        int n = arr.length;
        int count = 0;
        int left = 0;
        for(int i=0;i<n;i++){
             if(arr[i]>val){
                left = i+1;
             }
              if(i-left+1 == k){
                count++;
                left = i+1;
             }

        }
        return count;

    } 
}