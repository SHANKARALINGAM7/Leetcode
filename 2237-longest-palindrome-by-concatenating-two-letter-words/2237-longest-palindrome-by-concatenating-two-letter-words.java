class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int result = 0;
        int centralPalindromeUsed = 0;

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : map.keySet()) {
            String reversed = new StringBuilder(word).reverse().toString();
            int count = map.get(word);

            // Case 1: word is a palindrome itself (like "aa", "cc")
            if (word.charAt(0) == word.charAt(1)) {
                // Use pairs
                result += (count / 2) * 4;
                // Save one for the center if available and not used yet
                if (count % 2 == 1 && centralPalindromeUsed == 0) {
                    result += 2;
                    centralPalindromeUsed = 1;
                }
            }
            // Case 2: word and its reverse are different (like "ab" and "ba")
            else if (map.containsKey(reversed)) {
                int minPairs = Math.min(count, map.get(reversed));
                result += minPairs * 4;
                // Mark both as used
                map.put(word, 0);
                map.put(reversed, 0);
            }
        }

        return result;
    }
}
