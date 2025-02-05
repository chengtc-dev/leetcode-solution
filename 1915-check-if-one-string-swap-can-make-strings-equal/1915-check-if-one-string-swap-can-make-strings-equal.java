class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int[] s1FrequencyMap = new int[26];
        int[] s2FrequencyMap = new int[26];
        int numDiff = 0;

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                if (++numDiff > 2) {
                    return false;
                }
            }

            s1FrequencyMap[c1 - 'a']++;
            s2FrequencyMap[c2 - 'a']++;
        }

        return Arrays.equals(s1FrequencyMap, s2FrequencyMap);
    }
}