class Solution {
    public int solution(int[] num_list) {
        if(num_list.length >= 11) {
            int answer = 0;
            for(int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
            return answer;
        } else {
            int answer = 1;
            for(int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
            return answer;
        }
    }
}