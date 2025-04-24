class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer>s=new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        int  freq[] = new int[2001];
        int size = s.size(), n = nums.length, count = 0;
        int right = 0 ,left = 0, ans = 0;
        while(right < n){
            if(freq[nums[right]]==0)count++;
            freq[nums[right]]++;
            while(count == size){
                ans += n-right;
                freq[nums[left]]--;
                if(freq[nums[left]]==0)count--;
                left++;
            }
            right++;
        }
       
        return ans;
    }
}