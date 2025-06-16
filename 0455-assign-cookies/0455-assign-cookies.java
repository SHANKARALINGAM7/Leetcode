class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int n = g.length;
        int m = s.length;
        int  i = 0 , j = 0 , count =0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<n && j<m){
             if(s[j] >= g[i]){
                i++;
                j++;
                count++;
             }
             else j++;
        }

        return count;
    }
}