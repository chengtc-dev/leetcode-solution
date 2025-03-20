class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sumOfPoints = 0;
        int cardPointsSize = cardPoints.length;
        
        for (int point : cardPoints) {
            sumOfPoints += point;
        }

        if (cardPointsSize == k) {
            return sumOfPoints;
        }

        int remainedPoints = 0;
        int minRemainedPointsSize = cardPointsSize - k;

        for (int i = 0; i < minRemainedPointsSize; i++) {
            remainedPoints += cardPoints[i];
        }

        int minRemainedPoints = remainedPoints;

        for (int i = minRemainedPointsSize; i < cardPointsSize; i++) {
            remainedPoints = remainedPoints + cardPoints[i] - cardPoints[i - minRemainedPointsSize];
            minRemainedPoints = Math.min(remainedPoints, minRemainedPoints);
        }

        return sumOfPoints - minRemainedPoints;
    }
}