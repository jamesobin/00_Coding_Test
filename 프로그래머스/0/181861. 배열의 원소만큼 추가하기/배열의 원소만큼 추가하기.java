import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                answer.add(arr[i]);
            }
        }
        
        return answer;
    }
}
