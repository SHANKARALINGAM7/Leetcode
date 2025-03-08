class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=k,n=blocks.length();
        char ch[]=blocks.toCharArray();
        for(int i=0;i<=n-k;i++){
            int cnt=0;
            for(int j=i;j<i+k;j++){
                if(ch[j]=='W')cnt++;
            }
            min=Math.min(min,cnt);
        }
        return min;
    }
}