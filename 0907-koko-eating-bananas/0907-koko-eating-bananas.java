class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int min = 1, max = 0;

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        while (min <= max) {
            int mid = min + (max - min) / 2;
            long usedHour = 0;
            for (int pile : piles) {
                if (pile % mid == 0) {
                    usedHour += pile / mid;
                } else {
                    usedHour += pile / mid + 1;
                }
            }
            
            if (usedHour > h) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return min;
    }
}


