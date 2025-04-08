class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        for(int i = 0; i < num_list.length; i++) {
            int tmp = num_list[i];
            while(tmp != 1) {
                if(tmp % 2 == 0) {
                    tmp /= 2;
                } else {
                    tmp = (tmp - 1) / 2;
                }
                count++;
            }
        }

        return count;
    }
}