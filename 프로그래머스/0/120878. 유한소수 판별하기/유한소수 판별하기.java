class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        while(true) {
            if(b % 2 == 0) {
                b /= 2;
                continue;
            } else if (b % 5 == 0) {
                b /= 5;
                continue;
            } else {
                break;
            }
        }

        if( b % a == 0 || a % b == 0) {
            answer = 1;
        } else {
            answer = 2;
        }


        return answer;
    }
}