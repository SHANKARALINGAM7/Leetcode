class Solution {
    public int minOperations(int[][] grid, int x) {
        long sum=0;
        int rem=grid[0][0]%x;
        int row=grid.length,col=grid[0].length;
        int[] arr=new int[row*col];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum+=grid[i][j];
                arr[(i*col)+j]=grid[i][j];
                if(grid[i][j]%x!=rem)return -1;
            }
        }
        int n=grid.length*grid[0].length;
        Arrays.sort(arr);
        int k=check(arr,arr[arr.length/2]);
        return k/x;
    }

    public int check(int []arr,int k){
        int ans=0;
        for(int i=0;i<arr.length;i++){
                 ans+=Math.abs(arr[i]-k);
            
        }
        return ans;
    }
}