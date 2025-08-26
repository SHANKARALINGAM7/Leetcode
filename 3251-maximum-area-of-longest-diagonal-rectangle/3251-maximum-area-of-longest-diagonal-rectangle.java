class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
         int  ans = 0;
         double diog = 0;
         for(int a[]:dimensions){
            double diog1 = Math.sqrt((a[0]*a[0])+(a[1]*a[1]));
            if(diog<=diog1){
                if(diog==diog1)ans = Math.max(ans,a[0]*a[1]);
                else ans = a[0]*a[1];
                diog = diog1;
            }
         }
         return ans;
    }
}