class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int arr[]=new int[n];
        int ans[]=new int[queries.length];
        int pre[]=new int[n];
        String vow="aeiou";
        for(int i=0;i<n;i++){
          if(vow.contains(String.valueOf(words[i].charAt(0))) && vow.contains(String.valueOf(words[i].charAt(words[i].length()-1))))arr[i]=1;    
        }
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
             pre[i]=pre[i-1]+arr[i];
        }
        for(int i=0;i<queries.length;i++){
            int a=queries[i][0];
            int b=queries[i][1];
            if(a==b)ans[i]=arr[b];
            else if(a!=0)ans[i]=pre[b]-pre[a-1];
            else if(a==0) ans[i]=pre[b];
            
         }
       return ans;
    }
}