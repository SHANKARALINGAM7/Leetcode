class Solution {
    public int[] getNoZeroIntegers(int n) {

        int i = 1, j = n - 1;
        for (; i < j; i++, j--) {
            if ( help(i) && help(j) )
                return new int[] { i, j };
        }
        return new int[] { i, j };
    }

    public boolean help(int n){
        while(n>0){
           if(n%10 == 0){
            return false;
           }
           n /= 10;
        }
        return true;
    }
}