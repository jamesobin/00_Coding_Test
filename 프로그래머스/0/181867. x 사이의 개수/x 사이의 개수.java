class Solution {
    public int[] solution(String myString) {
        String[] strArray = myString.split("x");
        if(myString.charAt(myString.length()-1) != 'x') {
            int[] answer = new int[strArray.length];
    
            for(int i = 0; i < strArray.length; i++) {
                answer[i] = strArray[i].length();
            }
            
            return answer;
        } else {
            int[] answer = new int[strArray.length + 1];
    
            for(int i = 0; i < strArray.length; i++) {
                answer[i] = strArray[i].length();
            }
            answer[strArray.length] = 0;
            
            return answer;
        }
    }
}