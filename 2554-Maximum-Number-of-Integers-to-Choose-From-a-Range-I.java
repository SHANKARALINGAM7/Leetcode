class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum=0,ct=0;
        int arr[]=new int[n+1];
        for(int i:banned){
            if(i<=n)
            arr[i]=1;
        }
        for(int i=1;i<=n;i++){
          if(arr[i]==0){
            if(sum+i>maxSum)return ct;
            sum+=i;
            ct++;
          }
        }
        return ct;
    }
} 