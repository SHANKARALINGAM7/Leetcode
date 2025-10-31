class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[] = new int[2];
        int freq[] = new int[101];
        int cur = 0;
        for(int i:nums){
            if(freq[i] != 0){
                ans[cur] = i;
                cur++;
            }
          
            freq[i]++;
            
        }
        return ans;
    }
}