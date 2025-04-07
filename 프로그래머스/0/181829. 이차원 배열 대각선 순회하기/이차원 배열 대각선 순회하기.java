class Solution {
    public int solution(int[][] board, int k) {
        int result = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    result += board[i][j];
                }
            }
        }
        
        return result;
    }
}