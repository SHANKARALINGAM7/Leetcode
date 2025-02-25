class Solution {
    public int numberOfSteps(int num) {
        return count(num,0);
    }
    public int count(int n,int ct){
        if(n==0)return ct;
        if(n%2==1) return count(n-1,ct+1);
        return count(n/2,ct+1);
    }
}