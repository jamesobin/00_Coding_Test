class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i = 65; i <= 90; i++) {
            int count = 0;
            for(int j = 0; j < my_string.length(); j++) {
                char c = my_string.charAt(j);
                if(c == i) {
                    count++;
                }
            }
            answer[i-65] = count;
        }

        for(int i = 97; i <= 122; i++) {
            int count = 0;
            for(int j = 0; j < my_string.length(); j++) {
                char c = my_string.charAt(j);
                if(c == i) {
                    count++;
                }
            }
            answer[i-71] = count;
        }

        return answer;
    }
}