class Solution {
    public int longestBalanced(String s) {
        int ans = 1;
        int n = s.length();
        char ch[]  = s.toCharArray();

        for(int i=0;i<n;i++){
            int freq[] = new int[26];
            int countFreq[] = new int[1001];
            for(int j=i;j<n;j++){
                 char c = ch[j];
                 int len = j - i + 1;
                 freq[c-'a']++;
                 countFreq[freq[c - 'a']]++;
                 if(freq[c - 'a'] != 1){
                    countFreq[freq[c - 'a'] - 1]--;
                 }

                 if(countFreq[freq[c-'a']] * freq[c - 'a'] == len){
                     ans = Math.max(ans,len);
                 } 
                //  System.out.println(freq[c-'a'] +" : "+countFreq[freq[c-'a']] +" len : "+len);

            }
        }
        return ans;
    }
}