import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        
        String tmpString = "";
        int index = 0;
        for(int i = 0; i < str_list.length; i++) {
            String str = str_list[i];

            if(str.equals("l")) {
                tmpString = "l";
                index = i;
                break;
            }
            if(str.equals("r")) {
                tmpString = "r";
                index = i;
                break;
            }
        }

        if(tmpString.equals("")) {
            answer.clear();
        } else if(tmpString.equals("l")) {
            for(int i = 0; i < index; i++) {
                answer.add(str_list[i]);
            }
        } else {
            for(int i = index + 1; i < str_list.length; i++) {
                answer.add(str_list[i]);
            }
        }

        return answer;
    }
}
