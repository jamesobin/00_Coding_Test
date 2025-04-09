import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for(int i = 0; i < picture.length; i++) {
            String tmp = "";
            for(int j = 0; j < picture[i].length(); j++) {
                char c = picture[i].charAt(j);
                for(int x = 0; x < k; x++) {
                    tmp += c;
                }
            }

            for(int x = 0; x < k; x++) {
                answer.add(tmp);
            }
        }

        return answer;
    }
}
