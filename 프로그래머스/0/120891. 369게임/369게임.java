class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String sOrder = "" + order;
        String[] slist = sOrder.split("");
        
        for(int i = 0; i < slist.length; i++) {
            int index = Integer.parseInt(slist[i]);
            if(index == 3 || index == 6 || index == 9) {
                answer++;
            }
        }
        
        return answer;
    }
}