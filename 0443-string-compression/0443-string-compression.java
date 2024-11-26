class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        int ans = 0;
        int i = 0;

        while (i < len) {
            char currChar = chars[i];
            int count = 0;

            while (i < len && currChar == chars[i]) {
                count++;
                i++;
            }

            chars[ans++] = currChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }

        return ans;  
    }
}