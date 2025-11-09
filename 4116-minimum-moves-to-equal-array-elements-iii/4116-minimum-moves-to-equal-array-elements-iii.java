class Solution {
    public int minMoves(int[] nums) {
        
        int sum = 0 , max = 0;
        int n = nums.length;
        for(int i :nums){
            sum += i;
            max= Math.max(max,i);
        }

        return (max*n) - sum;
    }
}