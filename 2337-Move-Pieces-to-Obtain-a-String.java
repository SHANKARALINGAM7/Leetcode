class Solution {
    public boolean canChange(String start, String target) {
        int n=start.length();
        char first[]=start.toCharArray();
        char second[]=target.toCharArray();
        int l=0,r=0;
        for(int i=0;i<n;i++){
            // System.out.println(i+" "+second[i]+" "+first[i]);
           if(second[i]=='L'){
            if(r==0)l++;
            else return false;
           }
           else if(second[i]=='R')r++;
          
           if(first[i]=='L'){
            if(l>0 && r==0)l--;
            else return false;
           }
           else if(first[i]=='R'&& l==0)r--;
        }
        l=0;
        r=0;
        for(int i=n-1;i>=0;i--){
           if(second[i]=='L')l++;
           else if(second[i]=='R'){
            if(l==0)r++;
            else return false;
           }
          
            if(first[i]=='R'){
            if(r>0 && l==0)r--;
            else return false;
           }
           else if(first[i]=='L' && r==0)l--;
        }

        return (r==0&&l==0);
    }
}  