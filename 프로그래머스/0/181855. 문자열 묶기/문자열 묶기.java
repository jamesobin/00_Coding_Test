class Solution {
    public int solution(String[] strArr) {
        int[] lengthArr = new int[strArr.length];

        for(int i = 0; i < strArr.length; i++) {
            lengthArr[i] = strArr[i].length();
        }

        int max = 0;
        for(int i = 0; i < lengthArr.length; i++) {
            int count = 0;
            for(int j = i; j < lengthArr.length; j++) {
                if(lengthArr[i] == lengthArr[j]) {
                    count++;
                }
            }

            if(count > max) {
                max = count;
            }
        }

        return max;
    }
}