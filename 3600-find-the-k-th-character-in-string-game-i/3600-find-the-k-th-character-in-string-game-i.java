class Solution {
    public char kthCharacter(int k) {
        String s1="abbc";
        String s2="abbcbccd";
       if(k<8)return s2.charAt(k-1);
       while(s2.length()<k){
        char ch[]=s2.toCharArray();
        for(int i=0;i<ch.length;i++){
          if(ch[i]=='z')ch[1]='a';
          else  ch[i]=(char)(ch[i]+1);
        }
        s2+=String.valueOf(ch);
       }
       return s2.charAt(k-1);
    }
}