class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int tot = 0;
        for(int i:arr) tot += i;
        if(tot%3 != 0) return false;
        int each = tot/3 , sum = 0;
        int i = 0 , n = arr.length;
        int count =0;
        while(i<n){
            sum += arr[i];
            i++;
            if(sum == each){
                sum = 0;
                count++;
            }
        }
       
   
        return count>=3;
    }
}