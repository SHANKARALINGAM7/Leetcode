class Solution {
    public boolean checkStraightLine(int[][] arr) {
        int x0 = arr[0][0];
        int y0 = arr[0][1];
        int x1 = arr[1][0];
        int y1 = arr[1][1];
        if (x1 - x0 == 0) {
            for (int i = 2; i < arr.length; i++) {
                if (arr[i][0] != x0) {
                    return false;
                }
            }
            return true;
        }
        double slope = (double)(y1 - y0) / (x1 - x0);

        for (int i = 2; i < arr.length; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            if (x - x0 == 0) return false;

            double currentSlope = (double)(y - y0) / (x - x0);

            if (currentSlope != slope) {
                return false;
            }
        }

        return true;
    }
}
