class Solution {
    public int missingMultiple(int[] nums, int k) {
        int freq[] = new int[101];
        for(int i:nums) freq[i]++;
        int i = k;
        for( ;i<101;i+=k){
            if(freq[i]==0)return i;
        }
        return i;
    }
}