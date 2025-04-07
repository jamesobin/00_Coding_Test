import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> numList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(flag[i] == true) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    numList.add(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i]; j++) {
                    numList.remove(numList.size()-1);
                }
            }
        }

        return numList;
    }
}
