class Pair{
    int row;
    int col;
    int value;

    public Pair(int value, int row, int col){
        this.value = value;
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int k = queries.length;
        int rows = grid.length;
        int cols = grid[0].length;
        int[] ans = new int[k];

        Integer[] indices = new Integer[k];
        for(int i=0; i<k; i++){
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(queries[a], queries[b]));

        int[] dr = new int[]{-1, 0, 1, 0};
        int[] dc = new int[]{0, 1, 0, -1};

        int[][] vis = new int[rows][cols];
        vis[0][0] = -1; //visited

        PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> Integer.compare(a.value, b.value));
        queue.add(new Pair(grid[0][0], 0, 0));
        int count = 0;

        for(int q=0; q<k; q++){
            int currQuery = queries[indices[q]];
            while(!queue.isEmpty() && queue.peek().value < currQuery){
                Pair p = queue.poll();
                int currR = p.row;
                int currC = p.col;
                count++;

                for(int i=0; i<4; i++){
                    int nbrR = currR + dr[i];
                    int nbrC = currC + dc[i];

                    if(nbrR >= 0 && nbrR < rows && nbrC >= 0 && nbrC < cols && vis[nbrR][nbrC] != -1){
                        vis[nbrR][nbrC] = -1;
                        queue.add(new Pair(grid[nbrR][nbrC], nbrR, nbrC));
                    }
                }
            }
            ans[indices[q]] = count;
        }
        return ans;
    }
}