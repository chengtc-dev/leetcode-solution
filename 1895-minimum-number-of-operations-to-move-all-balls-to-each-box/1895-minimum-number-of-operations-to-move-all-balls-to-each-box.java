class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        
        int balls = 0;
        int moves = 0;
        for (int i = 0; i < n; i++) {
            answer[i] = balls + moves;
            moves += balls;  
            balls += Character.getNumericValue(boxes.charAt(i));
        }

        balls = 0;
        moves = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += balls + moves;
            moves += balls;
            balls += Character.getNumericValue(boxes.charAt(i));
        }

        return answer;
    }
}