class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            int ct=1;
            StringBuffer sb=new StringBuffer();
            char c=s.charAt(0);
            for(int j=1;j<s.length();j++){
               if(c!=s.charAt(j)){
                   sb.append(ct);
                   sb.append(c);
                   c=s.charAt(j);
                   ct=1;
               }
               else ct++;
            }
            sb.append(ct);
            sb.append(c);
            s=sb.toString();
        }
        return s;
    }
}