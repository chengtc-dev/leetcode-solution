class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> neighbors = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            neighbors.add(new ArrayList<>());
        }

        for (int[] connection : connections) {
            neighbors.get(connection[0]).add(connection[1]);
            neighbors.get(connection[1]).add(-connection[0]);
        }

        return dfs(neighbors, new boolean[n], 0);
    }

    private int dfs(List<List<Integer>> neighbors, boolean[] isVisited, int from) {
        int changes = 0;
        isVisited[from] = true;

        for (int neighbor : neighbors.get(from)) {
            if (!isVisited[Math.abs(neighbor)]) {
                changes += (neighbor > 0 ? 1 : 0) +
                    dfs(neighbors, isVisited, Math.abs(neighbor));
            }
        }

        return changes;
    }
}