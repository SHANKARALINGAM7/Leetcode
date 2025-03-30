class Solution {
   
    public List<Integer> partitionLabels(String s) {
         List<Integer> ans=new ArrayList<>();
         HashMap<Character,Integer>hm=new HashMap<>();
         int vis[]=new int[26];
         for(char c:s.toCharArray()){
            if(vis[c-'a']==0){
             int l=s.lastIndexOf(c);
             hm.put(c,l);
            }
         }
         int max=hm.get(s.charAt(0)),left=0,n=s.length();
         char ch[]=s.toCharArray();
         for(int i=0;i<n;i++){
             max=Math.max(max,hm.get(ch[i]));
            if(max==i){
                 ans.add(max-left+1);
                 left=max+1;
            }
               
         }
            
         

          return ans;
    }
}