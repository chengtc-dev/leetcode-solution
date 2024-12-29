class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visitedRooms = new boolean[n];

        dfs(rooms, 0, visitedRooms);

        for (boolean visitedRoom : visitedRooms) {
            if (!visitedRoom) return false;
        }

        return true;
    }

    private void dfs(List<List<Integer>> rooms, int room, boolean[] visitedRooms) {
        if (visitedRooms[room]) return; 

        visitedRooms[room] = true;

        for (int key : rooms.get(room)) {
            dfs(rooms, key, visitedRooms);
        }
    }
}