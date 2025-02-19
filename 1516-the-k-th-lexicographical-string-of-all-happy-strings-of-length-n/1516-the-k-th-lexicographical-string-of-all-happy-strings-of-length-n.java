class Solution {
    String ans="";
    int count=0;
    public String getHappyString(int n, int k) {
        help(new StringBuffer(),n,k);
        return ans;
    }

    public void help(StringBuffer sb,int n,int k){
        if(sb.length()>n)return ;
        for(char c='a';c<='c';c++){
             if(sb.length()==0){
                sb.append(c);
                if(sb.length()==n)count++;
                if(count==k){
                    ans=sb.toString();
                    return;
                }
                help(sb, n, k);
                sb.deleteCharAt(sb.length()-1);
             }
             else if(sb.charAt(sb.length()-1)!=c){
                sb.append(c);
                if(sb.length()==n)count++;
                if(sb.length()==n && count==k){
                    ans=sb.toString();
                    return;
                }
                 help(sb,n,k);
                 sb.deleteCharAt(sb.length()-1);
             }
             
        }
    }
}