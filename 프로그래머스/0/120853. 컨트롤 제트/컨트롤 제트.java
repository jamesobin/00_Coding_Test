class Solution {
    public int solution(String s) {
        String[] slist = s.split(" ");
        int answer = Integer.parseInt(slist[0]);

        for(int i = 1; i < slist.length; i++) {
            if(slist[i].equals("Z")) {
                answer -= Integer.parseInt(slist[i-1]);
            } else {
                answer += Integer.parseInt(slist[i]);
            }
        }

        return answer;
    }
}