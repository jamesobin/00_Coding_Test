class Solution {
    public int solution(String myString, String pat) {
        int answer = 0; 
        String tmp = "";
        for(int i = 0; i < myString.length() - pat.length() + 1; i++) {
            tmp = myString.substring(i, i + pat.length());

            if(tmp.equals(pat)) {
                answer++;
            }
        }

        return answer;
    }
}