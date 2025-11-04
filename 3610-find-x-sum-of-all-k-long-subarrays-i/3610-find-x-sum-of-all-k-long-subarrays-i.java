class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
         int freq[] = new int[51];
         int n = nums.length , ind = 0;
         int ans[] = new int[n-k+1];
         for(int i=0;i<k;i++){
            freq[nums[i]]++;
         }

         ans[ind] = helper(freq,x);
         ind++;
         for(int i=k;i<n;i++){
             freq[nums[i-k]]--;
             freq[nums[i]]++;
             ans[ind] = helper(freq,x);
             ind++;
         } 

         return ans;
    }

    public int helper(int arr[], int k){

        int ans = 0;
        // 0 -> val , 1 -> freq
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]){
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });

        for(int i=1;i<51;i++){
            pq.add(new int[]{i,arr[i]});
            if(pq.size()>k){
                pq.poll();
            }
        }

        while(pq.size()>0){
            int a[] =  pq.poll();
            ans += a[0] * a[1];
        }
        return ans;
    }
}