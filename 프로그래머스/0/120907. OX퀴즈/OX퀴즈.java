class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] slist = quiz[i].split(" ");
            int result = 0;
            
            if(slist[1].equals("+")) {
                result = Integer.parseInt(slist[0]) + Integer.parseInt(slist[2]);
            } else {
                result = Integer.parseInt(slist[0]) - Integer.parseInt(slist[2]);
            }
            
            if(result == Integer.parseInt(slist[4])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}