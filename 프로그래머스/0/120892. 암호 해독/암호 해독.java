class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
//         for(int i = 0; i < cipher.length(); i++) {
//             char c = cipher.charAt(i);
            
//             if((i+1) % code == 0) {
//                 answer += c;
//             }
//         }
        
        for(int i = code-1; i < cipher.length(); i += code) {
            char c = cipher.charAt(i);
            answer += c;
        }
        return answer;
    }
}