class Solution {
    public int numSub(String s) {
        long ans =  0;
        int mod = (int)(1e9 + 7);
        int n = s.length();
        int count = 0;

        for(char c : s.toCharArray()){

            if(c == '0'){

                  ans = (ans+(1L  * count * (count+1) / 2)) % mod;
                  count = 0;
            }
            else{
              count++;
            }
        }
       
       if(s.charAt(n-1)=='1'){
             ans = (ans+(1L * count * (count+1) / 2)) % mod;
       }

       return (int)(ans);

    }
}