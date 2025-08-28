class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length*grid.length;
        int low = 0, high = n-1;
        int ans = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(help(mid,grid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public boolean isValid(int x,int y,int vis[][],int n){
         return (x>=0 && y>=0 && x<n && y<n && vis[x][y]==0);
    }

    public boolean help(int k,int grid[][]){
        int n = grid.length;
        int vis[][] = new int[n][n];
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->grid[a[0]][a[1]]-grid[b[0]][b[1]]);
        pq.add(new int[]{0,0});
        if(grid[0][0]>k){
            return false;
        }
        vis[0][0] = -1;
        boolean is_reached = false;
        while(pq.size()>0){
             int cell[] = pq.poll();
             int x = cell[0], y =  cell[1];
             if(x == n-1 && y == n-1){
                is_reached = true;
                break;
             }
             for(int a[]:dir){
                if(isValid(x+a[0],y+a[1],vis,n) && grid[x+a[0]][y+a[1]]<=k){
                    pq.add(new int[]{x+a[0],y+a[1]});
                    vis[x+a[0]][y+a[1]] = -1;
                }
             }

        }
        return is_reached;
    }
}