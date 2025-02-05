class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int ct=0,n=s1.length();
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        char a='0',b='0';
        for(int i=0;i<n;i++){
            if(ch1[i]!=ch2[i]){
                if(ct==2)return false;
                if(ct==0){
                    a=ch1[i];
                    b=ch2[i];
                }
                if(ct==1){
                    if(a!=ch2[i] || b!=ch1[i])return false;
                }
                ct++;
            }

        }
        return ct==0 ||ct==2;
    }
}