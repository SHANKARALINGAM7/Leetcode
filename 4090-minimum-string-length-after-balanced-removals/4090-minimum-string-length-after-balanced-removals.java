class Solution {
    public int minLengthAfterRemovals(String s) {
        
        int n = s.length();
        int a = 0 , b = 0;
        for(char c : s.toCharArray()){
            if(c == 'a') a++;
            else b++;
        }

        return n - (2*Math.min(a,b));
    }
}