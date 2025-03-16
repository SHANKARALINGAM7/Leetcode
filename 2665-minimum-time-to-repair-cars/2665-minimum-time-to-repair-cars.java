class Solution {
    public long repairCars(int[] ranks, int cars) {
        int min=Integer.MAX_VALUE;
        for(int i:ranks){
              min=Math.min(min,i);
        }
        long low=1,high=(long)(Math.pow(cars,2)*min);
        long ans=-1;
        while(low<=high){
            long mid=(low+high)/2;
            if(check(ranks,mid)>=cars){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    public long check(int arr[],long k){
        long count=0;
        for(int i=0;i<arr.length;i++){
            long val=k/arr[i];
            count+=(long)(Math.sqrt(val));
        }
        return count;
    }
}