class Solution {
    public int solution(int[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    if(i < board.length-1) {
                        if(board[i+1][j] != 1) {
                            board[i+1][j] = 2;
                        }
                        if(j < board[i].length-1) {
                            if(board[i+1][j+1] != 1) {
                                board[i+1][j+1] = 2;
                            }
                        }
                        if(j > 0) {
                            if(board[i+1][j-1] != 1) {
                                board[i+1][j-1] = 2;
                            }
                        }
                    }

                    if(j < board[i].length-1) {
                        if(board[i][j+1] != 1) {
                            board[i][j+1] = 2;
                        }
                    }
                    if(j > 0) {
                        if(board[i][j-1] != 1) {
                            board[i][j-1] = 2;
                        }
                    }

                    if(i > 0) {
                        if(board[i-1][j] != 1) {
                            board[i-1][j] = 2;
                        }
                        if(j < board[i].length-1) {
                            if(board[i-1][j+1] != 1) {
                                board[i-1][j+1] = 2;
                            }
                        }
                        if(j > 0) {
                            if(board[i-1][j-1] != 1) {
                                board[i-1][j-1] = 2;
                            }
                        }
                    }
                }
            }

        }

        int count = 0;
    
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0) {
                    count++;
                }
            }
        }
    
        return count;
    }
}