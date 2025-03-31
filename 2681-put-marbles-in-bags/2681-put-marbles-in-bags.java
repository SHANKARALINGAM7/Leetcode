class Solution {
    public long putMarbles(int[] weights, int k) {
        int n=weights.length;
        if(k==1 || k==n) return 0;

        long[] pairsum= new long[n-1];
        for(int i=0;i<n-1;i++){
            pairsum[i]=weights[i]+weights[i+1];
        }

        Arrays.sort(pairsum);

        long min=0, max=0;
        for(int i=0;i<k-1;i++){
            min=min+pairsum[i];
            max=max+pairsum[n-2-i];
        }
        return max-min;
    }
}