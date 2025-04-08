class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int index = 0;

        if(myString.length() == 1) {
            answer = myString;
        } else {
            for(int i = myString.length(); i > 0; i--) {
                String tmp = myString.substring(0, i);
                if(tmp.endsWith(pat)) {
                    index = i;
                    break;
                }
            }
            answer = myString.substring(0, index);
        }

        return answer;
    }
}