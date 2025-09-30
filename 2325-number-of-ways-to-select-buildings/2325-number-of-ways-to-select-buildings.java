class Solution {
    public void prefixSum(long arr[],int n){
        for(int i=1;i<n;i++){
            arr[i] += arr[i-1];
        }
    }

    public long numberOfWays(String s) {
        int n =  s.length();
        char ch[] = s.toCharArray();
        long zero[] = new long[n];
        long one [] = new long[n];
        long totOne = 0 , totZero = 0;
        for(int i=0;i < n ;i++){
            char c = ch[i];
            if(c == '1'){
                one[i] = 1;
                totOne++;
            }
            else{
                zero[i] = 1;
                totZero++;
            }
        }
        prefixSum(one,n);
        prefixSum(zero,n);

        long ans = 0;

        for(int i=0;i<n;i++){
             if(ch[i] == '1'){
                  ans += (zero[i])*(totZero - zero[i]);
             }
             else{
                  ans += (one[i])*(totOne - one[i]);
             }
        }

        return ans;
    }
}