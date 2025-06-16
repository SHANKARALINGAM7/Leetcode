class Solution {
    public String helper(int x[] ,int y[]){
         if (y[0] - x[0] == 0) { 
            return "Infinity";
         }
          double slope = (double)(y[1]-x[1])/(y[0]-x[0]);
          if(slope==0) return "0";
          return String.valueOf(slope);
    }
    public int maxPoints(int[][] points) {
        int ans = 0;
        int n = points.length;

        for(int i=0;i<n;i++){
            HashMap<String,Integer> map = new HashMap<>();
            int max = 0;
             for(int j=i+1;j<n;j++){
                   String find =  helper(points[i],points[j]);
                   map.put(find,map.getOrDefault(find,0)+1);
                   max = Math.max(max,map.get(find));
             }
             ans = Math.max(ans,max+1);
        }

        return ans;
    }
}