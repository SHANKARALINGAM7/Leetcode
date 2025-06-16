class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int n = g.length;
        int m = s.length;
        int  i = 0 , j = 0 , count =0;
         Thread t1 = new Thread(() -> Arrays.sort(g));
        Thread t2 = new Thread(() -> Arrays.sort(s));
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){}

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