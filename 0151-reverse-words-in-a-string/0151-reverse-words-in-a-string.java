class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");
        int left = 0, right = words.length - 1;

        while (left < right) {
            String tmp = words[left];
            words[left] = words[right];
            words[right] = tmp;
            left++;
            right--;
        }

        for (String word : words) {
            if (!word.isEmpty()) {
                ans.append(word).append(" ");
            }
        }

        return ans.toString().trim();
    }
}