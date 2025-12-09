class Solution {
    public int specialTriplets(int[] nums) {
        int freq[] = new int[100001];
        for(int i:nums) freq[i]++;
        long ans = 0;
        int mod = (int)(1e9 +7 );
        int prefix[] = new int[100001];
        int count = freq[0];
        for(int i:nums){

            if(i != 0 && i*2 < 100001)
            ans =  (ans + 1L * prefix[(i*2)] * freq[(i*2)])%mod;
            prefix[i]++;
            freq[i]--;
            
        }

        int i = count -2;
        int j = 1;

        while(i>0){
            ans = (ans +  1L * i * j)%mod;
            i--;
            j++;
        }

        return (int)ans;
    }
}