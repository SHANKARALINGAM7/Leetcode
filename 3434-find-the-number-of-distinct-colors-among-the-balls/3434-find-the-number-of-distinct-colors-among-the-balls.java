class Solution {
    public int[] queryResults(int limit, int[][] queries) {
         Map<Integer,Integer>color=new HashMap<>();
         Map<Integer,Integer> ball=new HashMap<>();
         int ans[]=new int[queries.length];
         int ct=0;
         int i=0;
         for(int a[]:queries){
           if(!color.containsKey(a[1])){
            color.put(a[1],1);
            ct++;
            if(ball.containsKey(a[0])){
                int Ball=ball.get(a[0]);
                  color.put(Ball,color.get(Ball)-1);
                  if(color.get(Ball)==0){
                    color.remove(Ball);
                    ct--;
                  }
                  ball.put(a[0],a[1]);
             }
             else ball.put(a[0],a[1]);
           }
           else{
                color.put(a[1],color.get(a[1])+1);
                if(ball.containsKey(a[0])){
                int Ball=ball.get(a[0]);
                  color.put(Ball,color.get(Ball)-1);
                  if(color.get(Ball)==0){
                    color.remove(Ball);
                    ct--;
                  }
                  ball.put(a[0],a[1]);
                   }
                  else  ball.put(a[0],a[1]);
           }
            ans[i++]=ct;
         }
         return ans;
    }
}