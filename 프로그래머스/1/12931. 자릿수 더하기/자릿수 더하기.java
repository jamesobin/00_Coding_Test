import java.util.*;

public class Solution {
    public int solution(int n) {
        String num = n + "";
        
        int sum = 0;
        for(int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            sum += Character.getNumericValue(c);
        }
        
        return sum;
    }
}