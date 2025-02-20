class Solution {
    String ans="";
    Set<String>s=new HashSet<>();
    public String findDifferentBinaryString(String[] nums) {
        for(String str:nums)s.add(str);
        help(new StringBuffer(),nums[0].length());
        return ans;
    }

    public void help(StringBuffer sb,int n){
        if(sb.length()==n){
            if(!s.contains(sb.toString())){
                ans=sb.toString();  
            }
             return ;
        }
        sb.append("0");
        help(sb,n);
        sb.deleteCharAt(sb.length()-1);
        if(ans.length()!=0)return;
        sb.append("1");
        help(sb,n);
        sb.deleteCharAt(sb.length()-1);
        if(ans.length()!=0)return;
    }
}