class Solution {
    public String solution(int age) {
        String answer = "";
        
        String sAge = "" + age;
        
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        for(int i = 0; i < sAge.length(); i++) {
            char c = sAge.charAt(i);
            int index = Character.getNumericValue(c);
            
            answer += alphabet[index];
        }
        
        return answer;
    }
}