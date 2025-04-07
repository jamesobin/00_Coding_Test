class Solution {
    public int[] solution(int n) {
        int count = 0;
        int tmp = n;
        while(tmp != 1) {
            if(tmp % 2 == 0) {
                tmp /= 2;
            } else {
                tmp = 3 * tmp + 1;
            }

            count++;
        }

        int[] answer = new int[count + 1];
        answer[0] = n;
        for(int i = 1; i < answer.length; i++) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }

            answer[i] = n;
        }

        return answer;
    }
}