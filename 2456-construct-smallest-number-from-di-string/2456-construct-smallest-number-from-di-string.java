class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length()+1;
        char[] ch=new char[n];
        for(int i=0;i<n-1;i++){
            ch[i]=pattern.charAt(i);
        }
        ch[n-1]=ch[n-2];
        StringBuffer sb=new StringBuffer();
        help(ch,0,n,sb,new boolean[n+1]);
        return sb.toString();
    }

    public boolean help(char[] ch,int ind,int n,StringBuffer sb,boolean vis[]){
        if(ind==n)return true;
        for(int i=1;i<=n;i++){
        if(ind==0){
                sb.append(String.valueOf(i));
                vis[i]=true;
                if(help(ch,ind+1,n,sb,vis))return true;
                sb.deleteCharAt(ind);
                vis[i]=false;
            }
        else{
              char prev=ch[ind-1];
              int val=sb.charAt(ind-1)-'0';
              if(prev=='I'){
                 if(!vis[i] && val<i){
                    vis[i]=true;
                    sb.append(String.valueOf(i));
                    if(help(ch,ind+1,n,sb,vis))return true;
                    sb.deleteCharAt(ind);
                    vis[i]=false;
                 }
              }
              else{
                  if(!vis[i] && val>i){
                    vis[i]=true;
                    sb.append(String.valueOf(i));
                    if(help(ch,ind+1,n,sb,vis))return true;
                    sb.deleteCharAt(ind);
                    vis[i]=false;
                  }
                  
                }
            }
        }
        return false;
    }
}