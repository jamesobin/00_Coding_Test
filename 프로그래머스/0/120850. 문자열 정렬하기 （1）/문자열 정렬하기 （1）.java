import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(Character.isDigit(c)) {
                answer.add(Character.getNumericValue(c));
            }
        }
        
        Collections.sort(answer);
        
        return answer;
    }
}