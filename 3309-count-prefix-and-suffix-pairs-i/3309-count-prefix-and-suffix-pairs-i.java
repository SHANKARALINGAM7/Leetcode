class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count =0;
        for( int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
               int a=words[i].length();
                int b=words[j].length();
                 if(a<=b&&words[i].equals(words[j].substring(0,a))&&words[i].equals(words[j].substring(b-a,b))){
                     count++;
                 }
            }
        }
                    return count;
    }
}