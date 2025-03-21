class Solution {
    public int[] solution(int[] num_list, int n) {
        int count = 0;
        
        if(num_list.length % n == 0) {
            count = num_list.length / n;
        } else {
            count = num_list.length / n + 1;
        }
        
        int[] answer = new int[count];
        for(int i = 0; i < count; i++) {
            answer[i] = num_list[n*i];
        }
        
        return answer;
    }
}