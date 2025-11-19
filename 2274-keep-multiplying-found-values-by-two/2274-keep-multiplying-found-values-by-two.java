class Solution {
    public int findFinalValue(int[] nums, int original) {
         int freq[] = new int[1001];
         for(int i : nums){
            freq[i]++;
         }

         while(original <= 1000 && freq[original] != 0){
              original *= 2;
         }

         return original;
    }
}