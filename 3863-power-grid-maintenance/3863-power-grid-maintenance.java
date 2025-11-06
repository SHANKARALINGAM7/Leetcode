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
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        
         DisJointSet ds=new DisJointSet(c+1);
        
         HashMap<Integer,PriorityQueue<Integer>> hm = new HashMap<>();
         int inactive[] = new int[c+1];
         for(int a[] : connections){
              ds.union(a[0],a[1]);
         }

         for(int i = 1; i<=c ;i++){
              int parent = ds.findPar(i);
              if(hm.containsKey(parent)){
                      PriorityQueue<Integer> pq = hm.get(parent);
                      pq.add(i);
                      hm.put(parent,pq);
                  }
                   
              else{
                   PriorityQueue<Integer> pq = new PriorityQueue<>();
                   pq.add(i);
                   hm.put(parent,pq);
              }
         }

         List<Integer>l=new ArrayList<>();
         for(int q[]:queries){
            if(q[0]==1){
                if(inactive[q[1]] == 0){
                    l.add(q[1]);
                    continue;
                }
                int par = ds.findPar(q[1]);
                PriorityQueue<Integer> pq = hm.get(par);
                while(pq.size()>0){
                    int val = pq.poll();
                    if(inactive[val] == 0){
                        l.add(val);
                        pq.add(val);
                        hm.put(par,pq);
                        break;
                    }
                }
               if(pq.size() == 0) l.add(-1);
            }
            else{
                inactive[q[1]] = -1;
            }
         }
       
        int ans [] = new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}