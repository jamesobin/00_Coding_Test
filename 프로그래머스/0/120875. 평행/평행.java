class Solution {
    public int solution(int[][] dots) {
        double slope1a = (dots[0][1]-dots[1][1]) / (dots[0][0] - dots[1][0]);
        double slope1b = (dots[2][1]-dots[3][1]) / (dots[2][0] - dots[3][0]);
        
        double slope2a = (dots[0][1]-dots[2][1]) / (dots[0][0] - dots[2][0]);
        double slope2b = (dots[1][1]-dots[3][1]) / (dots[1][0] - dots[3][0]);

        double slope3a = (dots[0][1]-dots[3][1]) / (dots[0][0] - dots[3][0]);
        double slope3b = (dots[1][1]-dots[2][1]) / (dots[1][0] - dots[2][0]);

        int answer = 0;
        if(slope1a / slope1b == 1 || slope2a / slope2b == 1 || slope3a / slope3b == 1) {
            answer = 1;
        }

        return answer;
    }
}