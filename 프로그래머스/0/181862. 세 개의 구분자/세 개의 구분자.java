import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<String> solution(String myStr) {
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        myStr = myStr.trim();
        
        String[] tmp = myStr.split(" ");
        
        List<String> answer = new ArrayList<>();
        for(String s:tmp) {
            answer.add(s);
        }
        
        while(answer.contains("")) {
            answer.remove("");
        }

        if(answer.size() == 0) {
            answer.add("EMPTY");
        }
        
        return answer;
    }
}