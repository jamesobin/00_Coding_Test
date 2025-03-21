class Solution {
    public int[] solution(int[] num_list, int n) {
        String tmp = "";
        for(int i = 0; i < num_list.length; i++) {
            tmp += num_list[i] + "";
        }

        tmp = tmp.substring(n) + tmp.substring(0, n);

        int[] answer = new int[num_list.length];

        for(int i = 0; i < tmp.length(); i++) {
            answer[i] = Character.getNumericValue(tmp.charAt(i));
        }

        return answer;
    }
}