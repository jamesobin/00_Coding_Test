class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            
            if(c < 108) {
                answer += 'l';
            } else {
                answer += c;
            }
        }

        return answer;
    }
}