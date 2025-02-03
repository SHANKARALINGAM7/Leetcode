class Solution {
    public int closestMeetingNode(int[] adj, int node1, int node2) {
        int n=adj.length;
        int step1[]=new int[n];
        Arrays.fill(step1,Integer.MAX_VALUE);
        step1[node1]=0;
        while(adj[node1]!=-1 && step1[adj[node1]]==Integer.MAX_VALUE){
             step1[adj[node1]]=step1[node1]+1;
             node1=adj[node1];
        }
       
        int step2[]=new int[n];
        Arrays.fill(step2,Integer.MAX_VALUE);
        step2[node2]=0;
        while(adj[node2]!=-1 && step2[adj[node2]]==Integer.MAX_VALUE){
            step2[adj[node2]]=step2[node2]+1;
            node2=adj[node2];
       }
        int min=Integer.MAX_VALUE,max=0,meet=-1;
        for(int i=0;i<n;i++){
            if(step1[i]!=Integer.MAX_VALUE && step2[i]!=Integer.MAX_VALUE){
                 max=Math.max(step1[i],step2[i]);
                 if(min>max){
                    min=max;
                    meet=i;
                 }
                }
                
              
            }
            return meet;    
    }
}