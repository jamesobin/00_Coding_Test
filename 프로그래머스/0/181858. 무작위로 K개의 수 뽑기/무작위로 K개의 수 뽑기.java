import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] arr, int k) {
        List<Integer> ansList = new ArrayList<>();

        for(int i:arr) {
            if(!ansList.contains(i)) {
                ansList.add(i);
            }
            if(ansList.size() == k) {
                break;
            }
        }

        while(ansList.size() < k) {
            ansList.add(-1);
        }

        return ansList;
    }
}
