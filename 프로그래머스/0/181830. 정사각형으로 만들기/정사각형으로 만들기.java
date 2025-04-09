class Solution {
    public int[][] solution(int[][] arr) {
        int colLength = arr.length;
        int rowLength = arr[0].length;

        if(colLength > rowLength) {
            int[][] answer = new int[colLength][colLength];

            for(int i = 0; i < colLength; i++) {
                for(int j = 0; j < rowLength; j++) {
                    answer[i][j] = arr[i][j];
                }
                for(int j = rowLength; j < colLength; j++) {
                    answer[i][j] = 0;
                }
            }

            return answer;
        } else {
            int[][] answer = new int[rowLength][rowLength];
            
            for(int i = 0; i < colLength; i++) {
                for(int j = 0; j < rowLength; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
            for(int i = colLength; i < rowLength;i++) {
                for(int j = 0; j < rowLength; j++) {
                    answer[i][j] = 0;
                }
            }
            return answer;
        }
    }
}