class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i = 0; i < numLog.length - 1; i++) {
            int sub = numLog[i+1] - numLog[i];
            if(sub == 1) {
                answer += "w";
            } else if(sub == -1) {
                answer += "s";
            } else if(sub == 10) {
                answer += "d";
            } else if(sub == -10) {
                answer += "a";
            }
        }

        return answer;
    }
}