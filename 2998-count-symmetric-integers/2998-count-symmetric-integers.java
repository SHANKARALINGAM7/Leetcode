class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            if(i>=100 && i<=999)continue;
            String s=String.valueOf(i);
            if(s.length()%2==0){
                int n1=Integer.parseInt(s.substring(0,s.length()/2));
                int n2=Integer.parseInt(s.substring(s.length()/2,s.length()));
                int s1=0,s2=0;
                 while(n1!=0){
                 int rem=n1%10;
                 s1+=rem;
                 n1/=10;
                 }
                while(n2!=0){
                 int rem=n2%10;
                 s2+=rem;
                 n2/=10;
                 }
                if(s1==s2)c++;
            }
        }
        return c;
    }
}