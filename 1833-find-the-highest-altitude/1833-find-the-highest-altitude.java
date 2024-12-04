class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0, currentAltitude = 0;

        for (int altitude : gain) {
            currentAltitude += altitude;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }
}
