import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int n) {
        List<Integer> numList = new ArrayList<>();
        
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                numList.add(i);
            }

            while(n % i == 0) {
                n /= i;
            }
        }

        return numList;
    }
}
