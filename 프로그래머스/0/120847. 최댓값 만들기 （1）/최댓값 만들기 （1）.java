class Solution {
    public int solution(int[] numbers) {
        for(int i=0; i < numbers.length - 1; i++) {
            for(int j=i+1; j < numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        
        return numbers[0] * numbers[1];
    }
}