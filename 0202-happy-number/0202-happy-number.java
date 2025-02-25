class Solution {
    public boolean isHappy(int n) {
        int i=0;
        while(n!=1 &&i<10){
            int num=0;
            while(n>0){
              num+=(n%10)*(n%10);
              n/=10;
            }
            n=num;
            i++;
        }
        return n==1;
    }
}