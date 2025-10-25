class Solution {
    public int longestBalanced(int[] nums) {
        int max = 0 , n=nums.length;
        for(int i=0;i<n;i++){
            int odd = 0, even =0;
            int freq[] = new int[100001];
            for(int j=i;j<n;j++){
                if(nums[j]%2==0 && freq[nums[j]]==0)even++;
                else if(freq[nums[j]]==0) odd++;
                freq[nums[j]]=1;
                if(odd==even) max = Math.max(max,j-i+1);
            }
        }

        return max;
    }
}