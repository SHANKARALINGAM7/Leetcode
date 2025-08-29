class Solution {
    public long flowerGame(int n, int m) {
        long evenCount1 = n/2;
        long evenCount2 = m/2;
        long oddCount1 = evenCount1;
        long oddCount2 = evenCount2;
        if(n%2==1)oddCount1++;
        if(m%2==1)oddCount2++;
        return(oddCount1*evenCount2)+(oddCount2*evenCount1);

    }
}