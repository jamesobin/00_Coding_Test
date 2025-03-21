class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(sum <= n) {
                sum += numbers[i];
            } else {
                break;
            }
        }
        return sum;
    }
}