class Solution {
    public int solution(int[] numbers, int k) {
        int size = numbers.length;
        int answer = numbers[(k - 1) * 2 % size];

        return answer;
    }
}