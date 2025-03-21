class Solution {
    public int solution(int[] num_list) {
        int duplicate = 1;
        int sum = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            duplicate *= num_list[i];
            sum += num_list[i];
        }
        
        int answer = 0;
        if(duplicate < sum * sum) {
            answer = 1;
        }
        
        return answer;
    }
}