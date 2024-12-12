class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> ans=new HashSet<>();
        Set<String>ans1=new HashSet<>();
        int n=s.length();
        if(n<=10)return new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        char ch[]=s.toCharArray();
        for(int i=0;i<10;i++)sb.append(ch[i]);
        int j=10;
        ans1.add(sb.toString());
        while(j<n){
            sb.append(ch[j]);
            sb.deleteCharAt(0);
            if(!ans1.add(sb.toString())){
                ans.add(sb.toString());
            }
            j++;
        }
       
        return new ArrayList<>(ans);
    }
}