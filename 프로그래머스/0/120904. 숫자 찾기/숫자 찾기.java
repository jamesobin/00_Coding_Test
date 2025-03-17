class Solution {
    public int solution(int num, int k) {
        int answer = -1;

        String snum = "" + num;
        String[] slist = snum.split("");

        for(int i = 0; i < slist.length; i++) {
            int index = Integer.parseInt(slist[i]);
            if(index == k) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}