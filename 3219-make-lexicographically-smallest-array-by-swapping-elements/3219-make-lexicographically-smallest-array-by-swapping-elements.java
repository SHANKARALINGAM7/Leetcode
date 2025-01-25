class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        
        int n=nums.length;
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i]=new int[]{nums[i],i};
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<n-1;i++){
            int temp=i;
            pq.add(arr[i][1]);
            while(i<n-1 && arr[i+1][0]-arr[i][0]<=limit){
                pq.add(arr[i+1][1]);
                i++;
            }
            for(int j=temp;j<=i;j++)nums[pq.poll()]=arr[j][0];
        }
        return nums;
    }
}