class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
         int freq[]=new int[n];
         int j=0,count=0;
         for(int i=0;i<n;i++){
          if(freq[j]!=-1 && arr[i]==j){
             freq[j]=-1;
            while(j<i+1){
               if(freq[j]==0)break;
               j++;
            }
            if(j==i+1){
                 count++;
            }
          }
          else{
            freq[arr[i]]=-1;
          }
         }
        return count;
           }
}