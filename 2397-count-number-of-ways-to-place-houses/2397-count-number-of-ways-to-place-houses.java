class Solution {
    public int countHousePlacements(int n) {
        int mod = 1_000_000_007;
        long a = 2, b = 3, c = 0;

        if (n == 1) return 4;
        if (n == 2) return 9;

        for (int i = 3; i <= n; i++) {
            c = (a + b) % mod;
            a = b;
            b = c;
        }

        return (int)((c * c) % mod);  // Use long multiplication to avoid overflow
    }
}
