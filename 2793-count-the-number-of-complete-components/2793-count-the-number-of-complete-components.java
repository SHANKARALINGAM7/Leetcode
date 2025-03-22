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

            public int[] getParent(){
                return parent;
            }
            
        }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        DisJointSet ds=new DisJointSet(n);
        for(int a[]:edges){
            ds.union(a[0],a[1]);
            adj.get(a[0]).add(a[1]);
            adj.get(a[1]).add(a[0]);
        }
        HashMap<Integer,Set<Integer>>hm=new HashMap<>();
        int count=0;
        int arr[]=ds.getParent();
        for(int i=0;i<n;i++){
            int par=ds.findPar(i);
            if(!hm.containsKey(par))hm.put(par,new HashSet<>());
            hm.get(par).add(adj.get(i).size());
        }
      
        for(int k:hm.keySet()){
            if(hm.get(k).size()==1){
                for(int i:hm.get(k))if(i==ds.size[ds.findPar(k)]-1)count++;
            }
        }
        return count;
    }
}