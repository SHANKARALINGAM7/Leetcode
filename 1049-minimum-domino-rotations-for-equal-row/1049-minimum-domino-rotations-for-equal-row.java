class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {

          int ans1=help(tops,bottoms,tops[0]);
          if(ans1 != -1) return ans1;
          return help(bottoms,tops,bottoms[0]);
    }

    public int help(int a[],int b[],int k){
          int n=a.length;
          int topCount = 0, botCount = 0;
          for(int i=0;i<n;i++){
            if(a[i] != k && b[i] != k)return -1;
            else if(a[i] != k){
                topCount++;
            }
            else if(b[i] !=k) botCount++;
          }
        //   System.out.println(topCount+" "+botCount);
          return Math.min(topCount,botCount);
    }
}