class Solution {
    public double helper(int x[] ,int y[]){
         if (y[0] - x[0] == 0) { 
            return 100000;
         }
          double slope = (double)(y[1]-x[1])/(y[0]-x[0]);

          return slope;
    }
    public int maxPoints(int[][] points) {
        int ans = 0;
        int n = points.length;

        for(int i=0;i<n;i++){
            HashMap<Double,Integer> map = new HashMap<>();
            int max = 0;
             for(int j=0;j<n;j++){
                if(i==j)continue;
                   double find =  helper(points[i],points[j]);
                   map.put(find,map.getOrDefault(find,0)+1);
                   max = Math.max(max,map.get(find));
             }
             ans = Math.max(ans,max+1);
        }

        return ans;
    }
}