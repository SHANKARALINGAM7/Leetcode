class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(target>x+y)return false;
        int ans=gcd(Math.max(x,y),Math.min(x,y));
        return target%ans==0;
    }
    public int gcd(int a,int b){
         if(b==0)return a;
         return gcd(b,a%b);
    }
}