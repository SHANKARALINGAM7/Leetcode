class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int row=mat.length,col=mat[0].length,n=arr.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)hm.put(arr[i],i);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<row;i++){
            int max=-1;
            for(int j=0;j<col;j++){
                max=Math.max(max,hm.get(mat[i][j]));
            }
            min=Math.min(min,max);
        }
        for(int i=0;i<col;i++){
            int max=-1;
            for(int j=0;j<row;j++){
                max=Math.max(max,hm.get(mat[j][i]));
            }
            min=Math.min(min,max);
        }
        return min;
    }
}