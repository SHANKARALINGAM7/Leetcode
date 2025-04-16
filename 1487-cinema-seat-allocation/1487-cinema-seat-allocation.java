class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        
         Map<Integer,int[]> hm = new HashMap<>();
         for(int a[] : reservedSeats){
            hm.putIfAbsent(a[0],new  int[11]);
            hm.get(a[0])[a[1]]=1;
         }
         int ans = (n-hm.size())*2;
         for(int[] a : hm.values()){
             int prev=0,count=0;
             if(a[2]==0 && a[3]==0 && a[4]==0 && a[5]==0){
                 count++;
                  if(a[6]==0 && a[7]==0 && a[8]==0 && a[9]==0)count++;
             }
             else if(a[6]==0 && a[7]==0 && a[8]==0 && a[9]==0)count++;
             else if(a[4]==0 && a[5]==0 && a[6]==0 && a[7]==0)count++;
             ans+=count;
         }

         return ans;
    }
}