class Solution {
    public int[] solution(int[] arr) {
        int arrLenght = arr.length;
        int length = 1;

        while(length < arrLenght) {
            length *= 2;
        }

        int[] answer = new int[length];
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        for(int j = arrLenght; j < length; j++) {
            answer[j] = 0;
        }

        return answer;
    }
}