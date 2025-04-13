class Solution {
    public int countGoodNumbers(long n) {
        int mod = 1000000007;

        long evenCount = n/2; 
        long oddCount = n-evenCount;       

        long pow5 = power(4, evenCount, mod);
        long pow4 = power(5, oddCount, mod);

        return (int)((pow5 * pow4) % mod);
    }

    private long power(long base, long exp, int mod) {
        long result = 1;
        base = base % mod;

        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }
}
