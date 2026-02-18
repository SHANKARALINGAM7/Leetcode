class Solution {
    public boolean hasAlternatingBits(int n) {
        char ch[] = Integer.toString(n,2).toCharArray();
        int len = ch.length;
        for(int i=1;i<len;i++){
            if(ch[i] ==  ch[i-1])return false;
        }
        return true;
    }
}