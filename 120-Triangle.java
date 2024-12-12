class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size(),k=1;
        if(n==1)return triangle.get(0).get(0);
        for(int i=1;i<n;i++){
            k++;
           for(int j=0;j<k;j++){
            int min=triangle.get(i).get(j);
            
            if(j==0){
                min+=triangle.get(i-1).get(j);
            }
            else if (j==k-1){
                min+=triangle.get(i-1).get(j-1);
            }
            else{
                 min+=Math.min(triangle.get(i-1).get(j),triangle.get(i-1).get(j-1));
              }
         triangle.get(i).set(j,min);
           }
        }
        int ans=triangle.get(n-1).get(0);
        for(int i=1;i<n;i++){
            ans=Math.min(ans,triangle.get(n-1).get(i));
        }
        return ans;
    }
}