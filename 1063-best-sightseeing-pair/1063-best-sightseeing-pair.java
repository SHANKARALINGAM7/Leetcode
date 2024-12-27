class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int val1=0,val2=values[0];
        for(int i=1;i<n;i++){
            int num=values[i]-i;
            val1=Math.max(val1,val2+num);
            val2=Math.max(val2,values[i]+i);
        }
        return val1;

    }
}