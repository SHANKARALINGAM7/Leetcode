class Solution {
    public int maximumLength(String s) {
        int max=-1,n=s.length();
        HashMap<String,Integer>hm=new HashMap<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<n;i++){
        StringBuffer sb=new StringBuffer();
            for(int j=i;j<n;j++){
                   if(sb.length()==0 ||sb.charAt(sb.length()-1)==ch[j]){
                    sb.append(ch[j]);
                    hm.put(sb.toString(),hm.getOrDefault(sb.toString(),0)+1);
                    
                   }
                   else break;
            }
        }
        for(String str:hm.keySet()) {
            if(hm.get(str)>=3&& str.length()>max) {
                max=str.length();
            }
        }
        return max;
    }
}