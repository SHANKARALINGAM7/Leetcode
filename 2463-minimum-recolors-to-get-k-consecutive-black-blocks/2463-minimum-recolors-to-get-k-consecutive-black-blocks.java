class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=k,n=blocks.length(),cnt=0;
        char ch[]=blocks.toCharArray();
        for(int i=0;i<k;i++){
            if(ch[i]=='W')cnt++;
        }
        min=Math.min(min,cnt);
        for(int i=k;i<n;i++){
            if(ch[i-k]=='W')cnt--;
            if(ch[i]=='W')cnt++;
             min=Math.min(min,cnt);
        }
        return min;
    }
}