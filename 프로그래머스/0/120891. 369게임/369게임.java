class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String sOrder = "" + order;
        String[] slist = sOrder.split("");
        
        for(int i = 0; i < slist.length; i++) {
            int num = Integer.parseInt(slist[i]);
            if(num == 3 || num == 6 || num == 9) {
                answer++;
            }
        }
        
        return answer;
    }
}