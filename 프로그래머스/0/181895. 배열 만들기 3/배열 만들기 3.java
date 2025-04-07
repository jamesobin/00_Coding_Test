class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int length = 0;
        for(int i = 0; i < intervals.length; i++) {
            length += intervals[i][1] - intervals[i][0] + 1;
        }

        int[] answer = new int[length];

        int index = 0;
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answer[index] = arr[i];
            index++;
        }
        for(int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            answer[index] = arr[i];
            index++;
        }

        return answer;
    }
}