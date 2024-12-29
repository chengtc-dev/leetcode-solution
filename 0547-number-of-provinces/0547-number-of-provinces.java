class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int provinces = 0;
        boolean[] isVisited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) {
                dfs(isConnected, isVisited, i);
                provinces++;
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] isVisited, int city) {
        isVisited[city] = true;

        for (int i = 0; i < isConnected[city].length; i++) {
            if (isConnected[city][i] == 1 && !isVisited[i]) {
                dfs(isConnected, isVisited, i);
            }
        }
    }
}
