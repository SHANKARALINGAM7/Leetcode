class Solution {
    public int minimumDeletions(String word, int k) {
        int freq[] = new int[26];
        for(char c : word.toCharArray()){
             freq[c-'a']++;
        }
        Arrays.sort(freq);
        List<Integer> l = new ArrayList<>();
        for(int i:freq)if(i!=0)l.add(i);
        int ans=word.length();
        for (int a : l) {
            int rem = 0;
            for (int b : l) {
                if (a > b) {
                    rem += b;
                } else if (b > a + k) {
                    rem += b - (a + k);
                }
            }
            ans = Math.min(ans, rem);
        }
        return ans;

    }
}