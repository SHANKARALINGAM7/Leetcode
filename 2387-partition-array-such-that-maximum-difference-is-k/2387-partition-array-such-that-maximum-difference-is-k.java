class Solution {
    public int partitionArray(int[] arr, int k) {
         Thread t1 = new Thread(() -> Arrays.sort(arr));
         t1.start();
         try{
            t1.join();
        }catch(Exception e){}
         int count = 1;
         int min = arr[0] , n = arr.length;
         for(int i=0;i<n-1;i++){
               if(arr[i+1]-min>k){
                   count++;
                   min = arr[i+1];
               }
         }
         return count;
    }
}