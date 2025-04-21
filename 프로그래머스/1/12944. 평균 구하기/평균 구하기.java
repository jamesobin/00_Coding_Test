class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int num:arr) {
            sum += num;
        }
        
        double avg = (double)sum / arr.length;
        
        return avg;
    }
}