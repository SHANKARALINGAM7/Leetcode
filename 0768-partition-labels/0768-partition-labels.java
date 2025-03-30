class Solution {
   
    public List<Integer> partitionLabels(String s) {
         List<Integer> ans=new ArrayList<>();
         int vis[]=new int[26];
         int n=s.length();
         char ch[]=s.toCharArray();
         for(int i=0;i<n;i++){
              vis[ch[i]-'a']=i;
         }

         int max=0,left=0;
         for(int i=0;i<n;i++){
             max=Math.max(max,vis[ch[i]-'a']);
            if(max==i){
                 ans.add(max-left+1);
                 left=max+1;
             }
               
          }
        
          return ans;
    }
}