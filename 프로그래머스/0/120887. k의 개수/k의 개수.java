class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int x = i; x <= j; x++) {
            str += "" + x;
        }

        for(int x = 0; x < str.length(); x++) {
            char c = str.charAt(x);
            if(c == Character.forDigit(k, 10)) {
                answer++;
            }
        }
        
        return answer;
    }
}