import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> solution(String myString) {
        String[] tmp = myString.split("x");
        
        List<String> answer = new ArrayList<>();
        for(String s:tmp) {
            answer.add(s);
        }
        
        while(answer.contains("")) {
            answer.remove("");
        }

        Collections.sort(answer);

        return answer;
    }
}
