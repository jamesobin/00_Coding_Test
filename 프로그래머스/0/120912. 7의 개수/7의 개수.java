class Solution {
    public int solution(int[] array) {
        int count = 0;

        for(int i = 0; i < array.length; i++) {
            String snum = String.valueOf(array[i]);

            for(int j = 0; j < snum.length(); j++) {
                char c = snum.charAt(j);
                if(c == '7') {
                    count++;
                }
            }
        }

        return count;
    }
}