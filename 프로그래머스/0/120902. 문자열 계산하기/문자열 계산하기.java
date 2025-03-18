class Solution {
    public int solution(String my_string) {
        String[] slist = my_string.split(" ");
        int answer = Integer.parseInt(slist[0]);

        for(int i = 0; i < slist.length / 2; i ++) {
            if(slist[2 * i + 1].equals("+")) {
                answer += Integer.parseInt(slist[2 * (i + 1)]);
            } else {
                answer -= Integer.parseInt(slist[2 * (i + 1)]);
            }
        }

        return answer;
    }
}