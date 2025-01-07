class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String>set=new HashSet<>();
        int n=words.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
               if(words[i].contains(words[j]))set.add(words[j]);
               if(words[j].contains(words[i]))set.add(words[i]);
            }
        }
        List<String>l=new ArrayList<>();
        for(String s:set)l.add(s);
        return l;
        
    }
}