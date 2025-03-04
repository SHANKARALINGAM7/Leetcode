class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>>l=new ArrayList<>();
        int n=intervals.length;
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int st=intervals[0][0],end=intervals[0][1];
        for(int i=1;i<n;i++){
             if(intervals[i][0]>end){
               l.add(Arrays.asList(st, end));
                st=intervals[i][0];
                end=intervals[i][1];
             }
             else {
                end=Math.max(end,intervals[i][1]);
             }
        }
       l.add(Arrays.asList(st, end));
       int ans[][]=new int[l.size()][2];
       int i=0;
       for(List<Integer> li:l){
        ans[i][0]=li.get(0);
        ans[i][1]=li.get(1);
        i++;
       }
        return ans;
    }
}   