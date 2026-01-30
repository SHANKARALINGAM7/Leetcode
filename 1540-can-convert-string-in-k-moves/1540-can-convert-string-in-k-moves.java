class Solution {
    public boolean canConvertString(String s, String t, int k) {
        int nextMove[] = new int[26];
        int len1 = s.length();
        int len2 = t.length();
        if (len1 != len2)
            return false;
        char char1[] = s.toCharArray();
        char char2[] = t.toCharArray();

        for (int i = 0; i < len1; i++) {
            if (char1[i] != char2[i]) {
                int diff;
                if (char1[i] < char2[i]) {
                    diff = char2[i] - char1[i];
                } else {
                    diff = 'z' - char1[i] + (char2[i] - 'a' + 1);
                }
                if (nextMove[diff] == 0) {
                    if (diff <= k) {
                        nextMove[diff] = diff;
                    } else
                        return false;
                } else {
                    if (nextMove[diff] + 26 <= k) {
                        nextMove[diff] += 26;
                    } else
                        return false;
                }

            }
        }

        return true;
    }
}