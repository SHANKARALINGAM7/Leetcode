class Solution {
    public int findJudge(int n, int[][] trust) {
        int outDeg[]=new int[n+1];
        int inDeg[]=new int[n+1];
        for(int a[]:trust){
            outDeg[a[0]]++;
            inDeg[a[1]]++;
        }
        for(int i=1;i<=n;i++){
                if(outDeg[i]==0 && inDeg[i]==n-1)return i;
        }
         return -1;

    }
}