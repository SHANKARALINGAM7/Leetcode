class Solution {
    public long gridGame(int[][] grid) {
        int n=grid[0].length;
        long pre[]=new long[n];
        long suf[]=new long[n];
        pre[0]=grid[0][0];
        suf[n-1]=grid[1][n-1];
        for(int i=1;i<n;i++){
                pre[i]=pre[i-1]+grid[0][i];
        }
        for(int i=n-2;i>=0;i--){
               suf[i]=suf[i+1]+grid[1][i];
        }
        long ans=Long.MAX_VALUE,max=0;
        for(int i=0;i<n;i++){
           max=Math.max(pre[n-1]-pre[i],suf[0]-suf[i]);
           ans=Math.min(ans,max);
        }
     
        return ans;
    }
}