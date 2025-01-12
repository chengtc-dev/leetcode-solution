class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) return false;

        int openCount = 0;
        int unlocked = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            char isLocked = locked.charAt(i);

            if ('0' == isLocked) {
                unlocked++;
            } else if ('(' == c) {
                openCount++;
            } else {
                openCount--;
            }

            if (openCount < 0) {
                if (unlocked > 0) {
                    unlocked--;
                    openCount++;
                } else {
                    return false;
                }
            }
        }

        int closeCount = 0;
        unlocked = 0;
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            char isLocked = locked.charAt(i);

            if ('0' == isLocked) {
                unlocked++;
            } else if ('(' == c) {
                closeCount--;
            } else {
                closeCount++;
            }

            if (closeCount < 0) {
                if (unlocked > 0) {
                    unlocked--;
                    closeCount++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}