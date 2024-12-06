class Solution {
    public boolean closeStrings(String word1, String word2) {
        Set<Character> exist1 = new HashSet<>();
        Set<Character> exist2 = new HashSet<>();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : word1.toCharArray()) {
            exist1.add(c);
            freq1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            exist2.add(c);
            freq2[c - 'a']++;
        }

        for (char c : exist1) {
            if (!exist2.contains(c)) {
                return false;
            }
        }

        for (char c : exist2) {
            if (!exist1.contains(c)) {
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