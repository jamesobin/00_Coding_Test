class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'a') {
                answer += 'A';
            } else {
                answer += myString.charAt(i);
            }
        }
        
        return answer;
    }
}