class Solution {
    public int countBinarySubstrings(String s) {
        int zero = 0, one = 0;
        int ans = 0 , n = s.length();
        char ch[]=s.toCharArray();
        for(int i=0;i<n;i++){
             if(i>0 && ch[i] != ch[i-1]){
                 if(ch[i] == '1') one = 0;
                 else zero = 0;
              }

              if(one == zero){
                if(ch[i] == '1') zero = 0;
                else one = 0;
              }
      
            
           

           if(ch[i] == '0')zero++;
           else one++;

           if((ch[i] == '0' && one>=zero)|| (ch[i]== '1' && zero>=one)) ans++;
           
        }

        return ans;
    }
}