class Solution {

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        StringBuffer sb = new StringBuffer();
        sb.append(words[0]+" ");
        int count = 0,n = words.length;
        for(char c : words[0].toCharArray()){
            if(isVowel(c))count++;
        }
        for(int i=1;i<n;i++){
               
            String word = helper(words[i],count);
            sb.append(word+" ");
        }

        return sb.toString().trim();

    }

    public String helper(String s,int count){

        int n = s.length();
        StringBuffer rev = new StringBuffer();
        int currrentCount = 0;
        for(int i=n-1;i>=0;i--){
              char c = s.charAt(i);
             if(isVowel(c)) currrentCount++;
             rev.append(c);
        }

        if(count == currrentCount)return rev.toString();
        return s;
    }
}