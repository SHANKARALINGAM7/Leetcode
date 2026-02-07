class Solution {
    public int minimumDeletions(String s) {
        char ch[] = s.toCharArray();
        int n = ch.length;
        int prefix[] = new int[n];
        int min = n;
        int count1 = 0 ,count2 = 0;
        
        for(int i=0;i<n;i++){
            prefix[i] = count1;
            if(ch[i] == 'b') count1++;
        }

        for(int i=n-1;i>=0;i--){
            min = Math.min(min,count2+prefix[i]);
            if(ch[i] == 'a') count2++;
        }

        return min;
    }
}