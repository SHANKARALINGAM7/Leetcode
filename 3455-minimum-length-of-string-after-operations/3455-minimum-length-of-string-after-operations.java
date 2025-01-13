class Solution {
    public int minimumLength(String s) {
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int sum=0;
        for(int i:freq){
            if(i>2){
                if(i%2==0)sum+=2;
                else sum+=1;
            }
            else sum+=i;
        }
        return sum;
    }
}