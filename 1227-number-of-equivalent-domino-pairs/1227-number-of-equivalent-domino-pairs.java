class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int arr[][] = new int[11][11];
        for(int a[] : dominoes){
            arr[a[0]][a[1]]++;
        }
        int count = 0;
        for(int i=1;i<=10;i++){
            for(int j=i;j<=10;j++){
                   
                  int num =  arr[i][j] + arr[j][i];
                  if(i==j) num = arr[i][j];
                  count +=   (num*(num-1))/2;
            }
        }

        return count;
    }
}