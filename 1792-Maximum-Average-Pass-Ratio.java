class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]>pq=new PriorityQueue<>((a,b)-> Double.compare(b[0], a[0]));
        for(int arr[]:classes){
            double diff=help(arr[0],arr[1]);
           pq.add(new double[]{diff,arr[0],arr[1]});
        }
        while(extraStudents-->0){
            double[] current = pq.poll();
            int pass = (int) current[1];
            int tot = (int) current[2]; 
            double diff=help(pass+1,tot+1);
           pq.add(new double[]{diff,pass+1,tot+1});
        }
        double totalRatio = 0;
        while (!pq.isEmpty()) {
            double[] current = pq.poll();
            int pass = (int) current[1];
            int tot = (int) current[2];
            totalRatio += (double) pass/ tot;
        }

        return totalRatio / classes.length;
    }

      public double help(int pass,int tot){
        return ((double)(pass+1)/(tot+1)-(double)pass/tot);
      }
}