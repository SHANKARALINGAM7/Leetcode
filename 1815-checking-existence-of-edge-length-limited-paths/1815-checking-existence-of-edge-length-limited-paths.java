class Solution {
       public class DisJointSet{
               int parent[];
               int size[];
       
               public DisJointSet(int n){
                   parent=new int[n];
                   size=new int[n];
                   for(int i=0;i<n;i++){
                       size[i]=1;
                       parent[i]=i;
                   }
               }
               public int findPar(int node){
                       int node2=parent[node];
                       if(node==node2)return node;
                       int u_par=findPar(node2);
                       parent[node]=u_par;
                       return u_par;
               }
       
               public void union(int u,int v){
                   int u_par=findPar(u);
                   int v_par=findPar(v);
                   if(u_par==v_par)return;
                   int u_size=size[u_par];
                   int v_size=size[v_par];
       
                   if(u_size<=v_size){
                       parent[u_par]=v_par;
                       size[v_par]=u_size+v_size;
                   }
                   else {
                       parent[v_par]=u_par;
                       size[u_par]=u_size+v_size;
                   }
               }
               
           }
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        
        DisJointSet ds=new DisJointSet(n);
        int q[][]=new int[queries.length][4];
        boolean ans[]=new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            q[i][0]=queries[i][0];
            q[i][1]=queries[i][1];
            q[i][2]=queries[i][2];
            q[i][3]=i;
        }

        Arrays.sort(q,(a,b)->a[2]-b[2]);
        Arrays.sort(edgeList,(a,b)->a[2]-b[2]);
        int j=0;
        for(int i=0;i<q.length;i++){
          int wt=q[i][2];
           while(j<edgeList.length){
              if(edgeList[j][2]<wt){
                ds.union(edgeList[j][0],edgeList[j][1]);
                j++;
              }
              else break;
           }
           ans[q[i][3]]=ds.findPar(q[i][0])==ds.findPar(q[i][1]);
            
        }
    
         return ans;
        
    }
}