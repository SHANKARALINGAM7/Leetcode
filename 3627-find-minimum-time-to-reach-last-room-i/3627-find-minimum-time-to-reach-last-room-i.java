class Solution {
    int ans = Integer.MAX_VALUE;
    int row, col;

    public int minTimeToReach(int[][] moveTime) {
        row = moveTime.length;
        col = moveTime[0].length;

        int[][] vis = new int[row][col];
        for (int[] v : vis) {
            Arrays.fill(v, Integer.MAX_VALUE);
        }

        help(0, 0, vis, moveTime, 0);
        return ans;
    }

    public void help(int i, int j, int[][] vis, int[][] arr, int curDist) {
 
        if (curDist >= ans) return;

        if (vis[i][j] <= curDist) return;

        vis[i][j] = curDist;


        if (i == row - 1 && j == col - 1) {
            ans = Math.min(ans, curDist);
            return;
        }

        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        for (int[] d : dirs) {
            int ni = i + d[0];
            int nj = j + d[1];

            if (ni >= 0 && ni < row && nj >= 0 && nj < col) {
                int nextTime = Math.max(curDist + 1, arr[ni][nj] + 1);
                help(ni, nj, vis, arr, nextTime);
            }
        }
    }
}
