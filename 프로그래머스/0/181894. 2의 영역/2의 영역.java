import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] arr) {
        int start = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                start = i;
                break;
            }
        }

        int end = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 2) {
                end = i;
                break;
            }
        }

        List<Integer> answer = new ArrayList<>();
        for(int i = start; i <= end; i++) {
            answer.add(arr[i]);
        }

        if(answer.get(0) != 2) {
            answer.clear();
            answer.add(-1);
        }

        return answer;
    }
}
