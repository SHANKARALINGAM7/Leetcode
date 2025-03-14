class Solution {
    public int maximumCandies(int[] candies, long k) {
        int ans=0,low=1,high=0;
        for(int i:candies){
            high=Math.max(high,i);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(check(candies,mid)>=k){
                 ans=mid;
                 low=mid+1;
            }
            else{
               high=mid-1;
            }
        }
        return ans;
    } 

    public long check(int arr[],int k){
        long sum=0;
        for(int i:arr){
            sum+=i/k;
        }
        return sum;
    }
}