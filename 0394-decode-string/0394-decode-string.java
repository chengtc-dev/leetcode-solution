class Solution {
    public String decodeString(String s) {
        Deque<String> strStack = new ArrayDeque<>();
        Deque<Integer> numStack = new ArrayDeque<>();
        
        StringBuilder currentString = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                strStack.push(currentString.toString());
                numStack.push(num);
                currentString = new StringBuilder();
                num = 0;
            } else if (ch == ']') {
                int repeatCount = numStack.pop();
                String prevString = strStack.pop();
                String decoded = currentString.toString();
                
                StringBuilder newString = new StringBuilder(prevString);
                for (int i = 0; i < repeatCount; i++) {
                    newString.append(decoded);
                }
                currentString = newString;
            } else {
                currentString.append(ch);
            }
        }
        
        return currentString.toString();
    }
}
