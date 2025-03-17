class Solution {
    public int solution(int a, int b) {
        String ans1 = "" + a + b;
        String ans2 = "" + b + a;
        
        if(Integer.parseInt(ans1) >= Integer.parseInt(ans2)) {
            return Integer.parseInt(ans1);
        } else {
            return Integer.parseInt(ans2);
        }
    }
}