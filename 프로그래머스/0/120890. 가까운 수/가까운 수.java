class Solution {
    public int solution(int[] array, int n) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        int minSub = array[0] - n;

        if(minSub < 0) {
            minSub *= (-1);
        }

        int answer = 0;

        for(int i = 0; i < array.length; i++) {
            int sub = array[i] - n;
            if(sub < 0) {
                sub *= (-1);
            }

            if(sub <= minSub) {
                minSub = sub;
                answer = array[i];
            }
        }

        return answer;
    }
}