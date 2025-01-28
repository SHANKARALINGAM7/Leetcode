class Solution {
    public boolean canFinish(int num, int[][] arr) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<num;i++)adj.add(new ArrayList<>());
        int inDeg[]=new int[num];
        for(int a[]:arr){
            adj.get(a[1]).add(a[0]);
            inDeg[a[0]]++;
        }
        int count=0;
       Queue<Integer>q=new LinkedList<>();
       for(int i=0;i<num;i++){
        if(inDeg[i]==0){
            q.add(i);
            count++;
        }
       } 
      while(q.size()>0){
        int node=q.poll();
        for(int nxt:adj.get(node)){
            inDeg[nxt]--;
            if(inDeg[nxt]==0){
              count++;
                q.add(nxt);
            }
        }
      }

     return count==num;
    }
}