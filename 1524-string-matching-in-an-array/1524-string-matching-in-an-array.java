class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> matchedString = new HashSet<>();

        for (String word1 : words) {
            for (String word2 : words) {
                if (!word1.equals(word2) && word1.contains(word2)) {
                    matchedString.add(word2);
                }
            }
        }

        return new ArrayList<>(matchedString);
    }
}