class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreqMap = new int[26];

        for (String word : words2) {
            int[] freqMap = getFrequencyMap(word);
            for (int i = 0; i < 26; i++) {
                maxFreqMap[i] = Math.max(maxFreqMap[i], freqMap[i]);
            }
        }

        List<String> universalStrings = new ArrayList<>();

        for (String word : words1) {
            int[] freqMap = getFrequencyMap(word);
            if (isUniversal(freqMap, maxFreqMap)) {
                universalStrings.add(word);
            }
        }

        return universalStrings;
    }

    private int[] getFrequencyMap(String word) {
        int[] map = new int[26];
        for (char c : word.toCharArray()) {
            map[c - 'a']++;
        }
        return map;
    }

    private boolean isUniversal(int[] map, int[] maxMap) {
        for (int i = 0; i < 26; i++) {
            if (map[i] < maxMap[i])
                return false;
        }
        return true;
    }
}