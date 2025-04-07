import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        String tmpString = "";
        List<Integer> answer = new ArrayList<>();
        for(String str:intStrs) {
            tmpString = str.substring(s, s+l);

            int tmp = Integer.parseInt(tmpString);
            if(tmp > k) {
                answer.add(tmp);
            }
        }

        return answer;
    }
}
