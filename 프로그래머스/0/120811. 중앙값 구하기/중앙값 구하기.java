class Solution {
    public int solution(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i]>array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        
        int index = array.length / 2;
        
        return array[index];
    }
}