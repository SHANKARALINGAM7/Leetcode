class Solution {
    public int largestPrime(int n) {
        int sum = 0;
        int lastPrime = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                if (sum + i > n)
                    return lastPrime;
                if(sum + i == n){
                     if(isPrime(sum+i)) return sum+i;
                     return lastPrime;
                }
                sum += i;
                if(isPrime(sum)) lastPrime = sum;
            }
        }
        return lastPrime;
    }

    boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

}