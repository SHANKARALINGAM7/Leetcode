class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum=0,ct=0;
        Set<Integer>s=new HashSet<>();
        for(int i:banned)s.add(i);
        for(int i=1;i<=n;i++){
          if(!s.contains(i)){
            if(sum+i>maxSum)return ct;
            sum+=i;
            ct++;
          }
        }
        return ct;
    }
} 