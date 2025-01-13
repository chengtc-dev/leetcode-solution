class Solution {
    public int minimumLength(String s) {
        int[] charFrequency = new int[26];
        int totalLength = 0;

        for (char c : s.toCharArray()) {
            charFrequency[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (charFrequency[i] == 0) continue;

            if (charFrequency[i] % 2 == 0) {
                totalLength += 2;
            } else {
                totalLength++;
            }
        }

        return totalLength;
    }
}