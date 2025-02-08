class Solution {
    public int ladderLength(String strt, String end, List<String> dict) {
        Set<String>s=new HashSet<>();
        s.addAll(dict);
        int count=0;
        Queue<String>q=new LinkedList<>();
        q.add(strt);
        while(q.size()>0){
            int len=q.size();
            count++;
            for(int i=0;i<len;i++){
                String str=q.poll();
                if(str.equals(end))return count;
                s.remove(str);
                char ch[]=str.toCharArray();
                for(int k=0;k<ch.length;k++){
                      for(char j='a';j<='z';j++){
                          char temp=ch[k];
                          if(temp!=j){
                            ch[k]=j;
                            if(s.contains(String.valueOf(ch))){
                                q.add(String.valueOf(ch));
                            }
                          }
                          ch[k]=temp;
                      }
                }
            }
        
        }
        return 0;
    }
}