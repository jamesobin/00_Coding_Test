class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        int oddCount = 0;
        int evenCount = 0;
        
        for(int i:num_list) {
            if(i % 2 == 0) {
                evenCount ++;
            } else {
                oddCount ++;
            }
        }
        
        answer[0] = evenCount;
        answer[1] = oddCount;
        
        return answer;
    }
}