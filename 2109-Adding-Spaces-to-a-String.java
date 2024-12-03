class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuffer str=new StringBuffer();
        char[] ch=s.toCharArray();
        int j=0;
        for(int i=0;i<ch.length;i++){
            if(j<spaces.length && spaces[j]<ch.length && i==spaces[j]){
                str.append(" ");
                j++;
               
            }
            str.append(ch[i]);
        }
        return str.toString();
    }
}