class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] isExisting1 = new int[26];
        int[] isExisting2 = new int[26];
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : word1.toCharArray()) {
            isExisting1[c - 'a']++;
            freq1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            isExisting2[c - 'a']++;
            freq2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((isExisting1[i] != 0 && isExisting2[i] == 0) ||
                (isExisting1[i] == 0 && isExisting2[i] != 0)) {
                return false;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}