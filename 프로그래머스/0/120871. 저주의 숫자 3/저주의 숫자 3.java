class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i < n; i++) {
            while(answer % 3 == 0 || answer % 10 == 3 || (answer / 10) % 10 == 3) {
                answer += 1;
            }
            answer += 1;
        }

        return answer - 1;
    }
}