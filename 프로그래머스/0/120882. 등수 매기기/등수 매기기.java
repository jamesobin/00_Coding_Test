class Solution {
    public int[] solution(int[][] score) {
        double[] avgList = new double[score.length];
        int[] answer = new int[score.length]; 

        for(int i = 0; i < score.length; i++) {
            int sum = 0;
            
            for(int j = 0; j < 2; j++) {
                sum += score[i][j];
            }
            
            double avg = sum / 2.0;
            avgList[i] = avg;
        }        

        for(int j = 0; j < avgList.length; j++) {
            int rank = 1;
            
            for(int k = 0; k < avgList.length; k++) {
                if(avgList[j] < avgList[k]) {
                    rank += 1;
                }
            }
            answer[j] = rank;
        }

        return answer;
    }
}