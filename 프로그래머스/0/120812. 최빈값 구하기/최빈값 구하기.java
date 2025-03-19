class Solution {
    public int solution(int[] array) {
        int[] countList = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            int count = 1;
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            countList[i] = count;
        }

        int max = countList[0];
        for(int i = 1; i < countList.length; i++) {
            if(max < countList[i]) {
                max = countList[i];
            }
        }

        int countForCheck = 0;
        for(int i = 0; i < countList.length; i++) {
            if(countList[i] == max) {
                countForCheck++;
            }
        }

        int answer = 0;
        if(countForCheck == 1) {
            for(int i = 0; i < countList.length; i++) {
                if(countList[i] == max) {
                    answer = array[i];
                }
            }
        } else {
            answer = -1;
        }

        return answer;
    }
}