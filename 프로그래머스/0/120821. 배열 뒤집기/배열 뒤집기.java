class Solution {
    public int[] solution(int[] num_list) {
        int tmp = 0;
        
        for(int i = 0; i < (num_list.length / 2); i++) {
            tmp = num_list[num_list.length - 1 - i];
            num_list[num_list.length - 1 - i] = num_list[i];
            num_list[i] = tmp;
        }
        return num_list;
    }
}