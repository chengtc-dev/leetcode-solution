class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }

        int maxNum = count;

        for (int i = 0; i < s.length() - k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count--;
            }

            if (vowels.indexOf(s.charAt(i + k)) != -1) {
                count++;
            }

            maxNum = Math.max(maxNum, count);
        }

        return maxNum;
    }
}