class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans=-1,carry=0,flag=0,gsum=0,csum=0;
        for(int i=0;i<gas.length;i++){
            gsum+=gas[i];
            csum+=cost[i];
            carry+=gas[i]-cost[i];
            if(carry<0){
                   carry=0;
                   ans=-1;
                   flag=0;
            }
            else if(flag==0) {
                ans=i;
                flag=1;
            }
          //  System.out.println(carry);
        }
        if(gsum<csum)ans=-1;
        return ans;
    }
}