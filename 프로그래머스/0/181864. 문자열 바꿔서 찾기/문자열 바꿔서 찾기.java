class Solution {
    public int solution(String myString, String pat) {
        String newString = "";
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A') {
                newString += "B";
            } else {
                newString += "A";
            }
        }
        
        int answer = 0;
        
        if(newString.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}