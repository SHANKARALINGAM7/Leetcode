class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][0] > target)break;
              for(int j=0;j<m;j++){
                  if(matrix[i][j] == target) return true;
                  if(matrix[i][j] > target)break;
              }
        }
        return false;
    }
}