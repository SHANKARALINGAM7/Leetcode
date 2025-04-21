class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
           long min =0 , max= 0;
           long sum = 0;
           for(int i : differences){
                sum += i;
                max = Math.max(max,sum);
                min = Math.min(min,sum);
                
           }

            int ans = (int)((upper-lower)-(max-min)+1);

            return ans>0 ? ans : 0;
     }
}