import java.util.Arrays;
import java.util.List;

public class Solution {
    public String solution(String my_string, int[] indices) {
        List<String> stringList = Arrays.asList(my_string.split(""));
        for(int i:indices) {
            stringList.set(i, "");
        }

        String answer = "";
        for(String s:stringList) {
            if(s != "") {
                answer += s;
            }
        }
        return answer;
    }
}
