class Solution {
      public class Pair {
              int row;
              int count;
      
              public Pair(int row, int count) {
                  this.row = row;
                  this.count = count;
              }
          }
    public int[] kWeakestRows(int[][] mat, int k) {

       PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
         if (a.count == b.count) {
             return Integer.compare(a.row, b.row); 
             }
          return Integer.compare(a.count, b.count);  
        });

        int n=mat.length,m=mat[0].length;
        for(int i=0;i<n;i++){
            int  flag=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    pq.add(new Pair(i,j));
                    flag=1;
                    break;
                }
            }
             if(flag==0)  pq.add(new Pair(i,m));
        }
        
        int ans[]=new int[k];
        int j=0;
        while(k-->0){
          ans[j++]=pq.poll().row;
        }
        return ans;
    }
}