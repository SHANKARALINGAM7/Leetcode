class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
         int q =queries.length, n =s.length(), prev=-1, j=0;
         int ans[] = new int[q];
         int pre[] = new int[n];
         char ch[] = s.toCharArray();
         HashMap<Integer,Integer> hm = new HashMap<>();
         for(int i=0;i<n;i++){
             if(ch[i]=='|'){
                hm.put(i,j++);
                prev=i;
             } 
             pre[i]=prev;
         }
         prev=-1;
         int suf[] = new int[n];
          for(int i=n-1;i>=0;i--){
             if(ch[i]=='|'){
                prev=i;
             } 
             suf[i]=prev;
         }
        
          j=0;
         for(int a[]:queries){
            int left=pre[a[0]], right = suf[a[1]];
            if(left==-1 || left<a[0])left= suf[a[0]];
            if(right==-1 || right>a[1])right = pre[a[1]];
            if(left != -1 && right != -1 && left>=a[0] && right<=a[1] && right-left>1){
                int inPlate = hm.get(right)-hm.get(left)-1;
                 ans[j] += right-left-inPlate-1;
            }
            j++;
         }

         return ans;
    }
}