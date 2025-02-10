class Solution {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (
                result.length() != 0 &&
                Character.isDigit(s.charAt(i))
            ) {
                result.setLength(result.length() - 1);
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}