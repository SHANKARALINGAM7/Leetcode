class Solution {
    public int[] getNoZeroIntegers(int n) {

        int i = 1, j = n - 1;
        for (; i < j; i++, j--) {
            if (!Integer.toString(i).contains("0") && !Integer.toString(j).contains("0"))
                return new int[] { i, j };
        }
        return new int[] { i, j };
    }
}