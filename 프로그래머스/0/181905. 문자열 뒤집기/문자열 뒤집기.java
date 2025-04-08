class Solution {
    public String solution(String my_string, int s, int e) {
        String tmp = "";
        for(int i = e; i >= s; i--) {
            char c = my_string.charAt(i);
            tmp += c;
        }

        String answer = my_string.substring(0, s) + tmp + my_string.substring(e+1);

        return answer;
    }
}