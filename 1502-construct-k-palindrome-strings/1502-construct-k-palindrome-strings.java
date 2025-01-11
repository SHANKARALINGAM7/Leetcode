class Solution {
    public boolean canConstruct(String s, int k) {
        if(k>s.length())return false;
        int [] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int oddCount=0;

        for(int i:freq)if(i%2==1)oddCount++;
        if(oddCount>k)return false;
        return true;
    }
}