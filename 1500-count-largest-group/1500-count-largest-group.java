class Solution {
    public int countLargestGroup(int n) {
        int freq[] = new int[37];
        int max = 0;
        for(int i=1;i<=n;i++){
            int num = help(i);
            freq[num]++;
            if(max<freq[num])max=freq[num];
        }
       int count = 0;
       for(int i : freq) if(i==max)count++;
       return count;
    }

    public int help(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}

