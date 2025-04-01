class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;

        for(int x = i; x <= j; x++) {
            String numString = String.valueOf(x);
            for(int y = 0; y < numString.length(); y++) {
                char c = numString.charAt(y);

                if(c == Character.forDigit(k, 10)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}