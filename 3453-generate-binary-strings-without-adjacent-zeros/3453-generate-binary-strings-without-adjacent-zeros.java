class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> validStrings(int n) {
        helper(new StringBuffer(),n);
        return ans;
    }

    public void helper(StringBuffer s,int n){
        if(n==0){
            ans.add(s.toString());
            return ;
        }
        int len = s.length();
        if(len==0 || s.charAt(len-1) != '0'){
            s.append("0");
            helper(s,n-1);
            s.deleteCharAt(s.length()-1);
        }
        s.append("1");
        helper(s,n-1);
        s.deleteCharAt(s.length()-1);
    }
}