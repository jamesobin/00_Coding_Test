class Solution {
    public int solution(int[] sides) {
        for(int i = 0; i < sides.length - 1; i++) {
            int tmp = 0;
            
            if(sides[i] > sides[i + 1]) {
                tmp = sides[i];
                sides[i] = sides[i + 1];
                sides[i + 1] = tmp;
            }
        }
        
        if((sides[0] + sides[1]) > sides[2]) {
            return 1;
        } else {
            return 2;
        }
    }
}