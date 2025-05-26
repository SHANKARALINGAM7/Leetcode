class Solution {
    public int reverse(int x) {
       
        int f=0,tem=0;
        int rev=0,ct=0,k=x%10;
        if(x<0){
            x=x*(-1);
            f=1;
            k=-1*k;
        }
        while(x!=0){
            tem=x%10;
            if (rev > (Integer.MAX_VALUE - tem) / 10)return 0;
            rev=rev*10+tem;

            x=x/10;
           
        
        }
        
        if(f==0)return  rev;
        return -1*rev;
    }
}