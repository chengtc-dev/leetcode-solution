class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> occurrences = new HashSet<>();

        for (int value : arr) {
            int count = map.getOrDefault(value, 0);
            map.put(value, ++count);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (!occurrences.add(entry.getValue())) {
                return false;
            }
        }

        return true;
    }
}