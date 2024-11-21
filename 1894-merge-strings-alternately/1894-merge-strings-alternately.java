class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1 = 0, p2 = 0;
        int len1 = word1.length(), len2 = word2.length();
        StringBuilder ans = new StringBuilder();
        
        while(p1 < len1 && p2 < len2) {
            ans.append(word1.charAt(p1++));
            ans.append(word2.charAt(p2++));
        }
        
        while(p1 < len1) {
            ans.append(word1.charAt(p1++));
        }
        
        while(p2 < len2) {
            ans.append(word2.charAt(p2++));
        }
        
        return ans.toString();
    }
}