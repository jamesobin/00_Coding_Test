class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = 0;

        for(int i = 0; i < num; i++) {
            sum += i;
        }

        int sub = (total - sum) / num;

        for(int j = 0; j < num; j++) {
            answer[j] = j + sub;
        }

        return answer;
    }
}