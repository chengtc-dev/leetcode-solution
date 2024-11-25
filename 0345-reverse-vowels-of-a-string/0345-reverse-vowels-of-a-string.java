class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(
            Arrays.asList(
                'a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U'
            )
        );
        int len = s.length();
        int left = 0, right = len - 1;
        char[] ans = s.toCharArray();

        while (left < right) {
            while (left < right && !vowels.contains(ans[left])) {
                left++;
            }

            while (left < right && !vowels.contains(ans[right])) {
                right--;
            }

            char tmp = ans[left];
            ans[left] = ans[right];
            ans[right] = tmp;

            left++;
            right--;
        }

        return new String(ans);
    }
}