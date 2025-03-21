class Solution {
    public String solution(String n_str) {
        int index = 0;
        int i = 0;
        while(n_str.charAt(i) == '0') {
            index++;
            i++;
        }

        String answer = n_str.substring(index);

        return answer;
    }
}