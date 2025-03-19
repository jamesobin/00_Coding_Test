class Solution {
    public int solution(int[][] dots) {
        int xMax = dots[0][0];
        int xMin = dots[0][0];
        int yMax = dots[0][1];
        int yMin = dots[0][1];

        for(int i = 0; i < dots.length; i++) {
            if(dots[i][0] > xMax) {
                xMax = dots[i][0];
            }

            if(dots[i][0] < xMin) {
                xMin = dots[i][0];
            }

            if(dots[i][1] > yMax) {
                yMax = dots[i][1];
            }

            if(dots[i][1] < yMin) {
                yMin = dots[i][1];
            }
        }

        int result = (xMax - xMin) * (yMax - yMin);

        return result;
    }
}