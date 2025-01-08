class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int count=0,max=0,n=piles.length;
        for(int i=0;i<n;i++)max=Math.max(max,piles[i]);
        int low=1,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long val=findHour(piles,mid,n);
           // System.out.println(mid + " "+val);
            if(val<=h){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low;
    }

    public long findHour(int arr[],int val,int n){
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=arr[i]/val;
            if(arr[i]%val!=0)ans++;
        }
        return ans;
    }
}