class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        int sP = 0, tP = 0;

        while (sP < sLen && tP < tLen) {
            if (s.charAt(sP) == t.charAt(tP)) {
                sP++;
            }
            tP++;
        }
        
        return sP == sLen;
    }
}