class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        
        for(int i:array) {
            if(i >= max) {
                max = i;
            }
        }
        
        int index = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == max) {
                index = i;
            }
        }
        
        int[] answer = {max, index};
        
        return answer;
    }
}