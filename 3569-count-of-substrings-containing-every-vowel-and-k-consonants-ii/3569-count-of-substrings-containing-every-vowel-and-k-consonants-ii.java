class Solution {
    public long countOfSubstrings(String word, int k) {
        int[][] freq = new int[2][128];
        freq[0]['a'] = 1;
        freq[0]['e'] = 1;
        freq[0]['i'] = 1;
        freq[0]['o'] = 1;
        freq[0]['u'] = 1;

        long response = 0;
        int curr = 0, vowels = 0, extraLeft = 0;

        for (int i = 0, left = 0; i < word.length(); i++) {
            char iChar = word.charAt(i);

            if (freq[0][iChar] == 1) {
                if (++freq[1][iChar] == 1) vowels++;
            } else {
                curr++;
            }

            while (curr > k) {
                char leftChar = word.charAt(left);
                if (freq[0][leftChar] == 1) {
                    if (--freq[1][leftChar] == 0) vowels--;
                } else {
                    curr--;
                }
                left++;
                extraLeft = 0;
            }

            while (vowels == 5 && curr == k && left < i && freq[0][word.charAt(left)] == 1 && freq[1][word.charAt(left)] > 1) {
                extraLeft++;
                freq[1][word.charAt(left)]--;
                left++;
            }

            if (curr == k && vowels == 5) {
                response += (1 + extraLeft);
            }
        }

        return response;
    }
}