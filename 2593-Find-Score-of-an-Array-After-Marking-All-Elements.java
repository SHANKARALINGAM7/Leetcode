class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]){
                return a[2]-b[2];
            }
            return a[0]-b[0];
        });
        int n=nums.length;
        int next=1,prev=-1;
        if(n==1)return nums[0];
        pq.add(new int[]{nums[0],prev,0,next});
        for(int i=1;i<n-1;i++){
            next++;
            prev++;
            pq.add(new int[]{nums[i],prev,i,next});
        }
        pq.add(new int[]{nums[n-1],n-2,n-1,-1});
       
        long result = 0;
        while (pq.size()>0) {
           int[] sub=pq.poll();
           //System.out.println(sub[0]+" "+sub[1]+" "+sub[2]+" "+sub[3]);
           int val=sub[0];
           prev=sub[1];
           int cur=sub[2];
           next=sub[3];
           if(nums[cur]!=-1){
            result+=val;
           if(prev!=-1)nums[prev]=-1;
           if(next!=-1)nums[next]=-1;
           }
           //System.out.println(result);
           
        }
         return result;
        
    }
}