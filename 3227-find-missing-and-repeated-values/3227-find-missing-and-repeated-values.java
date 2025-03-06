class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer>s=new HashSet<>();
        int miss=-1,n=grid.length;
        int sum=0;
        for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 if(!s.add(grid[i][j]))miss=grid[i][j];
                 sum+=grid[i][j];
             }
        }
        n=n*n;
       int tot=(n*(n+1))/2;
        return new int[]{miss,tot-(sum-miss)};
    }
}