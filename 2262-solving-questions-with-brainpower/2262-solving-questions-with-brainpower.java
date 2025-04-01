class Solution {
    public long mostPoints(int[][] questions) {
           long dp[]=new long[questions.length];
           return help(questions,0,dp);
    }

    public long help(int arr[][],int i,long dp[]){
        if(i>=arr.length)return 0;
        if(dp[i]!=0)return dp[i];
        long pick=arr[i][0]+help(arr,i+arr[i][1]+1,dp);
        long unpick=help(arr,i+1,dp);
        dp[i]= Math.max(pick,unpick);
        return dp[i];
    }


}