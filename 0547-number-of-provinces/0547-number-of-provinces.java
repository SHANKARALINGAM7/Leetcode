class Solution {
    public int findCircleNum(int[][] arr) {
        int n=arr.length;
        DisJointSet ds=new DisJointSet(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                        ds.union(i,j);
                }
            }
        }
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(ds.findPar(i));
        }
        return s.size();
    }

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
}