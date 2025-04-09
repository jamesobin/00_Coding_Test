import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        int i = 0;
        while(i < arr.length) {
            if(stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else {
                if(stk.get(stk.size()-1) != arr[i]) {
                    stk.add(arr[i]);
                    i++;
                } else {
                    stk.remove(stk.size()-1);
                    i++;
                }
            }
        }

        if(stk.size() == 0) {
            stk.add(-1);
        }

        return stk;
    }
}
