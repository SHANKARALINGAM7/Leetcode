class Solution {
    public int minCost(String colors, int[] neededTime) {
        int curSum = neededTime[0] , count = 1;
        int curMax= neededTime[0];
        int ans = 0;
        int n = neededTime.length;
        char arr[] = colors.toCharArray();

        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                curMax = Math.max(curMax,neededTime[i]);
                curSum += neededTime[i];
                count++;
            }
            else{
                if(count>1){
                     ans += (curSum-curMax);
                }
                curMax = neededTime[i];
                curSum = neededTime[i];
                count = 1;
            }
        }

        if(count>1){
             ans += (curSum-curMax);
            }

        return ans;         
    }
}