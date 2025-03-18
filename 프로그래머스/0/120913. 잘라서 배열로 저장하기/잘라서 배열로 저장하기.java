import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> solution(String my_str, int n) {
        List<String> slist = new ArrayList<>();

        for(int i = 0; i < my_str.length() / n; i++) {
            String tmp = "";

            for(int j = 0; j < n; j++) {
                char c = my_str.charAt(i * n + j);
                tmp += c;
            }

            slist.add(tmp);
        }

        if(my_str.length() % n != 0) {
            String tmp = "";

            for(int i = (my_str.length() / n) * n; i < my_str.length(); i++) {
                char c = my_str.charAt(i);

                tmp += c;
            }
            
            slist.add(tmp);
        }

        return slist;
    }
}
