import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = new ArrayList<>();

        for(int i:arr) {
            arrList.add(i);
        }

        for(int j:delete_list) {
            for(int k = 0; k < arrList.size(); k++) {
                if(j == arrList.get(k)) {
                    arrList.remove(k);
                }
            }
        }

        return arrList;
    }
}