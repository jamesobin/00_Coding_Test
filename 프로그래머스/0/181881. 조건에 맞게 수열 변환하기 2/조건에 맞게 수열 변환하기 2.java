class Solution {
    public int solution(int[] arr) {
        int tmp = 0;
        int max = 0;
        
        for(int i = 0; i < arr.length; i++) {
            tmp = arr[i];
            int count = 0;

            while(tmp >= 50 && tmp % 2 == 0 || tmp <= 50 && tmp % 2 == 1) {
                if(tmp >= 50 && tmp % 2 == 0) {
                    tmp /= 2;
                } else {
                    tmp = tmp * 2 + 1;
                }
                count++;
            }

            if(count > max) {
                max = count;
            }
        }

        return max;
    }
}