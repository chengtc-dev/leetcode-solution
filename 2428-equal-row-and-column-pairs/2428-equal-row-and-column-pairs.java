class Solution {
    public int equalPairs(int[][] grid) {
        int pairs = 0;
        int n = grid.length;
        Map<String, Integer> rows = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                row.append(grid[i][j]).append(',');
            }
            String rowKey = row.toString();
            rows.put(rowKey, rows.getOrDefault(rowKey, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            StringBuilder col = new StringBuilder();
            for (int j = 0; j < n; j++) {
                col.append(grid[j][i]).append(',');
            }
            String colKey = col.toString();
            pairs += rows.getOrDefault(colKey, 0);
        }

        return pairs;
    }
}
