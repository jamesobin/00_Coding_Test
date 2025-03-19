class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
    
        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("right")) {
                if(answer[0] < board[0] / 2) {
                    answer[0] += 1;
                }  
            } else if(keyinput[i].equals("left")) {
                if(-(board[0] / 2) < answer[0]) {
                     answer[0] -= 1;
                }   
            } else if(keyinput[i].equals("up")) {
                if(answer[1] < board[1] / 2) {
                     answer[1] += 1;
                }   
            } else {
                if(-(board[1] / 2) < answer[1]) {
                     answer[1] -= 1;
                } 
            }
        }

        return answer;
    }
}