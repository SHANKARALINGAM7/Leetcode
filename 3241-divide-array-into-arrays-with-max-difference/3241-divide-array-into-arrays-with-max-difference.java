class Solution {
    public int[][] divideArray(int[] arr, int k) {
        Thread t1 = new Thread(() -> Arrays.sort(arr));
         t1.start();
         try{
            t1.join();
        }catch(Exception e){}
        int n = arr.length;
        int ans [][] = new int[n/3][3];
        int j = 0;
        for(int i=0;i<n;i+=3){
            if(arr[i+2]-arr[i]>k) return new int[][]{};
            ans[j][0] = arr[i];
            ans[j][1] = arr[i+1];
            ans[j][2] = arr[i+2];
            j++;

        }

        return ans;
    }
}