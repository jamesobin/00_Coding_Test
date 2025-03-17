class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(65 <= c && c <= 90) {
                answer += my_string.valueOf(c).toLowerCase();
            } else {
                answer += my_string.valueOf(c).toUpperCase();
            }
        }
        
        return answer;
    }
}