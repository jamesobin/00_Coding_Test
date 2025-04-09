import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        for(int i = l; i <= r; i++) {
            String numStr = Integer.toString(i);

            if(!(numStr.contains("1") || numStr.contains("2") || numStr.contains("3") || numStr.contains("4") || numStr.contains("6") || numStr.contains("7") || numStr.contains("8") || numStr.contains("9"))) {
                answer.add(i);
            }
        }
        
        if(answer.size() == 0) {
            answer.add(-1);
        }

        return answer;
    }
}
