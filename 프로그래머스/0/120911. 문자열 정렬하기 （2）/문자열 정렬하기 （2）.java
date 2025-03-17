import java.util.*;

class Solution {
    public String solution(String my_string) {
        String str = my_string.toLowerCase();

        String[] strList = str.split("");

        Arrays.sort(strList);
        String answer = "";
        for(int i = 0; i < strList.length; i++) {
            answer += strList[i];
        }
        
        return answer;
    }
}