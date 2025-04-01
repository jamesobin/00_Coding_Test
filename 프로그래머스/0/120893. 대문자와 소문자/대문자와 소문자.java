class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(65 <= c && c <= 96) {
                // answer += my_string.valueOf(c).toLowerCase();
                answer += (char)(c + 32);
            } else {
                // answer += my_string.valueOf(c).toUpperCase();
                answer += (char)(c - 32);
            }
        }
        
        return answer;
    }
}