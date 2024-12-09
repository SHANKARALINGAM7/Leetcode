class Solution {
    List<String>list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuffer ans=new StringBuffer();
        help(n,0,0,ans);
        return list;
    }

    public void help(int n,int open, int close,StringBuffer sb){
          if(open==n && close==n){
            list.add(sb.toString());
            return;
          }
          if (open < n) {
            sb.append(\(\);
            help(n, open+1, close, sb);
            sb.deleteCharAt(sb.length()-1); 
          }

        if (close < open) {
            sb.append(\)\);
            help(n, open, close+1, sb);
            sb.deleteCharAt(sb.length()-1); 
        }


    }
}