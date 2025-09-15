class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        int freq[]= new int[26];
        for(char c: brokenLetters.toCharArray()){
            freq[c-'a']++;
         }
        for(String s : text.split(" ")){
            if(isValid(s,freq)){
                count++;
            }
        }
        return count;
    }

    public boolean isValid(String word,int freq[]){

         for(char c: word.toCharArray()){
            if(freq[c-'a'] != 0){
                return false;
            }
         }

         return true;
    }
}