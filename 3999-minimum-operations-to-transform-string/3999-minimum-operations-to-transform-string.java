class Solution {
    public int minOperations(String s) {
        char ch[] = s.toCharArray();
        int max = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i] != 'a'){
                max = Math.max(max,123-ch[i]);
            }
        }
        return max;
    }
}