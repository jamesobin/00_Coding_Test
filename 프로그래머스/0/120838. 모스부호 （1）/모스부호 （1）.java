import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static final Map<String, String> morseMap = new HashMap<>() {
        {
            put(".-", "a");
            put("-...", "b");
            put("-.-.", "c");
            put("-..", "d");
            put(".", "e");
            put("..-.", "f");
            put("--.", "g");
            put("....", "h");
            put("..", "i");
            put(".---", "j");
            put("-.-", "k");
            put(".-..", "l");
            put("--", "m");
            put("-.", "n");
            put("---", "o");
            put(".--.", "p");
            put("--.-", "q");
            put(".-.", "r");
            put("...", "s");
            put("-", "t");
            put("..-", "u");
            put("...-", "v");
            put(".--", "w");
            put("-..-", "x");
            put("-.--", "y");
            put("--..", "z");
        }
    };

    public String solution(String letter) {
        String[] slist = letter.split(" ");
        String answer = "";

        for(int i = 0; i < slist.length; i++) {
            answer += morseMap.get(slist[i]);
        }
        return answer;
    }
}