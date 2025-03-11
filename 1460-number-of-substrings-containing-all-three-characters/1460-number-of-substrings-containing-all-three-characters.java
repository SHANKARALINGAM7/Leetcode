class Solution {
    public int numberOfSubstrings(String s) {
              int ans=0;
              int n=s.length();
              char ch[]=s.toCharArray();
               int a=0,b=0,c=0,k=n-1;
              for(int i=n-1;i>=0;i--){
                     if(ch[i]=='a')a++;
                     else if(ch[i]=='b')b++;
                     else c++;
                     
                    while(a>0 && b>0 && c>0){
                        ans+=(i+1);
                        if(ch[k]=='a')a--;
                        else if(ch[k]=='b')b--;
                        else c--;
                        k--;
                    }
              }
              return ans;
    }
}
