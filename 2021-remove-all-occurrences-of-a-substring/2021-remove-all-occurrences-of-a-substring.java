class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuffer sb=new StringBuffer();
        for(char c:s.toCharArray()){
            sb.append(c);
            if(sb.indexOf(part)!=-1)sb.replace(sb.indexOf(part),sb.indexOf(part)+part.length(),"");
        }
        return sb.toString();
    }
}