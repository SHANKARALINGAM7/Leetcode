class Solution {
    public int scoreOfString(String s) {
         int n = s.length();
         int ans = 0;
         char ch[] = s.toCharArray();
         for(int i=1;i<n;i++){
             ans += Math.abs(ch[i]-ch[i-1]);
         }
         return ans;
    }
}