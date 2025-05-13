class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int freq [] = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        int mod=(int)(1e9+7);
        while(t-->0){
            int temp[] = new int[26];
            for(int i=0;i<26;i++){
                 if(i != 25){
                     temp[i+1]= freq[i]%mod;
                 }
                 else{
                     temp[0] = freq[i]%mod;
                     temp[1] = (temp[1]+freq[i])%mod;
                 }
            }
            for(int i=0;i<26;i++)freq[i]=temp[i];
        }

        int ans = 0 ;
        for(int i=0;i<26;i++){

            ans = (ans%mod + freq[i]%mod)%mod;
        }

        return ans;

    }
}