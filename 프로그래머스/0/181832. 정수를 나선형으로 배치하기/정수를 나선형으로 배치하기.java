class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int y = 0;
        int x = 0;
        int dir = 0;
        int[] dy = { 0, 1, 0, -1 };
        int[] dx = { 1, 0, -1, 0 };
        while (num <= n * n) {
            answer[y][x] = num++;
            int ny = y + dy[dir];
            int nx = x + dx[dir];
            if (ny < 0 || nx < 0 || ny >= n || nx >= n || answer[ny][nx] != 0) {
                dir = (dir + 1) % 4;
                ny = y + dy[dir];
                nx = x + dx[dir];
            }
            y = ny;
            x = nx;
        }
        return answer;
    }
}