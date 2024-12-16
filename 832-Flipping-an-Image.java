class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row=image.length,col=image[0].length;
        for(int i=0;i<row;i++){
            for(int j=col-1;j>=col/2;j--){
                 int temp=image[i][j];
                 image[i][j]=1-image[i][col-j-1];
                 image[i][col-j-1]=1-temp;
            }
        }
        return image;
    }
}