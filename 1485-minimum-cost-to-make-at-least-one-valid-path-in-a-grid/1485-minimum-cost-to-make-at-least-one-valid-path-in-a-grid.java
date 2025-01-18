class Solution {
    public int minCost(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        boolean[][] vis = new boolean[row][col];
        int[][] cost = new int[row][col];
        
        for (int[] c : cost) {
            Arrays.fill(c, Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, 0, 0});
        cost[0][0] = 0;

        int[][] path = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!pq.isEmpty()) {
            int[] node = pq.poll();
            int cst = node[0], i = node[1], j = node[2];

            if (vis[i][j]) continue;
            vis[i][j] = true;

            if (i == row - 1 && j == col - 1) return cst;

            for (int k = 0; k < 4; k++) {
                int x = i + path[k][0], y = j + path[k][1];

                if (x >= 0 && x < row && y >= 0 && y < col) {
                    int nextCost = cst + ((grid[i][j] != (path[k][0] == 0 ? (path[k][1] == 1 ? 1 : 2) : (path[k][0] == 1 ? 3 : 4))) ? 1 : 0);
                    
                    if (nextCost < cost[x][y]) {
                        cost[x][y] = nextCost;
                        pq.add(new int[]{nextCost, x, y});
                    }
                }
            }
        }

        return -1;
    }
}
