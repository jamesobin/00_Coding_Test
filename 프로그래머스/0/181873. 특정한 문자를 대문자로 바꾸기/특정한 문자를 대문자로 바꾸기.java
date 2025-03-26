class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(Character.toString(c).equals(alp)) {
                answer += alp.toUpperCase();
            } else {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}