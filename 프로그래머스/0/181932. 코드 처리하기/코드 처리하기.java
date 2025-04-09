class Solution {
    public String solution(String code) {
        String answer = "";
        int tmp = -1;
        for(int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if(c == '1') {
                tmp *= (-1);
            }

            if(tmp == 1) {
                if(i % 2 != 0 && c != '1') {
                    answer += c;
                }
            } else {
                if(i % 2 == 0 && c != '1') {
                    answer += c;
                }
            }
        }
        
        if(answer.equals("")) {
            answer = "EMPTY";
        }

        return answer;
    }
}