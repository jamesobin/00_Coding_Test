class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            String tmp = "";
            for(int j = queries[i][1]; j >= queries[i][0]; j--) {
                tmp += my_string.charAt(j);
            }
            my_string = my_string.substring(0, queries[i][0]) + tmp + my_string.substring(queries[i][1]+1);
        }

        return my_string;
    }
}