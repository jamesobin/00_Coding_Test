class Solution {
    public int solution(int[] sides) {
        int side1 = sides[0];
        int side2 = sides[1];
        int count = 0;

        for(int i = 1; i < side1 + side2; i++) {
            if(i < side1 + side2 && side1 < i + side2 && side2 < i + side1) {
                count++;
            }
        }

        return count;
    }
}