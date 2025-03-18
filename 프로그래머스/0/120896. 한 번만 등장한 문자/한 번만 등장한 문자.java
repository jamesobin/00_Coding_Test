import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String str = "";
        
        for(int i = 0; i < s.length(); i++) {
            int count = 0;
            char c1 = s.charAt(i);

            for(int j = 0; j < s.length(); j++) {
                char c2 = s.charAt(j);

                if(c1 == c2) {
                    count ++;
                }
            }

            if(count == 1) {
                str += c1;
            }
        }
        
        String[] slist = str.split("");
        Arrays.sort(slist);
        String answer = "";

        for(int i = 0; i < slist.length; i++) {
            answer += slist[i];
        }

        return answer;
    }
}