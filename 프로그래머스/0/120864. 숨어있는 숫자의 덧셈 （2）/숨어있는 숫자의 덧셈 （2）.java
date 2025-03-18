class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if(Character.isDigit(c)) {
                num = num * 10 + Character.getNumericValue(c);
            } else {
                answer += num;
                num = 0;
            }
        }

        answer += num;

        return answer;
    }
}