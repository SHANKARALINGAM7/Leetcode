class Solution {
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int vowelConsonantScore(String s) {
        int vowel = 0, consonant = 0;
        for(char c : s.toCharArray()){
            if(isVowel(c)){
                vowel++;
            }
            else if(Character.isLetter(c)){
                consonant++;
            }
        }

         if(consonant == 0){
            return 0;
        }

    return (int)(vowel/consonant);
    }

   
}