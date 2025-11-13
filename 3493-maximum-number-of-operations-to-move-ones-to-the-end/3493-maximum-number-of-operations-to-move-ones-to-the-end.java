class Solution {
    public int maxOperations(String s) {
        int one = 0;
        int ans = 0;
        char ch[] = s.toCharArray();
        int n = ch.length;
        if(ch[0] == '1'){
            one = 1;
        }
        for(int i=1;i<n;i++){
            if(ch[i] == '1' && ch[i-1] == '0'){
                ans += one;
                one += 1;
            }
            else if(ch[i] == '1'){
                 one += 1;
            }
        }

        if(ch[n-1] == '0'){
            ans += one;
        }
        return ans;
    }
}