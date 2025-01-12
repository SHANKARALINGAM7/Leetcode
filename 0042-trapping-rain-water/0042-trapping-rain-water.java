class Solution {
    public int trap(int[] arr) {
        int n=arr.length,tot=0;
        int pre[]=new int[n];
        int suf[]=new int[n];
        pre[0]=arr[0];suf[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(pre[i-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(suf[i+1],arr[i]);
        }
        
        
        for(int i=0;i<n;i++){
            int lMax=pre[i],rMax=suf[i];
            if(lMax>arr[i] && arr[i]<rMax){
                tot+=Math.min(lMax,rMax)-arr[i];
            }
        }
        return tot;
    }
}