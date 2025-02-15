class Solution {
    public int[] help(int n){
        int len=(int)(Math.log10(n)+1);
        int arr[]=new int[len];
        int k=len-1;
        while(n>0){
            arr[k--]=n%10;
            n/=10;
        }
        return arr;
    }
    public boolean check(int arr[],int i,int tot,int k){
        if(i==arr.length)return (tot==k);
        int sum=0;
        for(int j=i;j<arr.length;j++){
            sum=(sum*10)+arr[j];
            if(sum<=k){
                if(check(arr,j+1,tot+sum,k))return true;
            }
        }
        return false;
    }
    public int punishmentNumber(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
        //    if(i%9==0 || i%9==1) {
            int arr[]=help(i*i);
            int sqr=i*i;
            if(check(arr,0,0,i)){
                ans+=sqr;
            }
        //    }
        }
        return ans;
    }
}