class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        boolean[] isEmpty = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            isEmpty[i] = (boxes.charAt(i) == '0') ? true : false;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && !isEmpty[j]) {
                    answer[i] += Math.abs(j - i); 
                }
            }
        }

        return answer;
    }
}