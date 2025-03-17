class Solution {
    public int[] solution(int n) {
        int count = 0;
        int half = (n-1) / 2 + 1;
        int[] answer = new int[half];
        
        
        if(n % 2 == 0) {
            for(int i = 0; i < (n/2); i ++) {
                answer[i] = 2 * i + 1;
            }
        } else {
            for(int i = 0; i < (n/2 + 1); i ++) {
                answer[i] = 2 * i + 1;
            }
        }
        
        return answer;
    }
}