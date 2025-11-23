class Solution {
    public long sumAndMultiply(int n) {
        char ch[] = Integer.toString(n).toCharArray();
        String ans = "";
        long sum = 0;
        for(char c:ch){
            if(c != '0'){
                 ans += c;
                 sum += c-'0';
            }
        }
        if(ans.length() == 0)return 0;
        long res = 1L* sum * (Long.parseLong(ans));

        return res;
    }
}