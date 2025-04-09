import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> tmpList = new ArrayList<>();
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                tmpList.add(rank[i]);
            }
        }

        Collections.sort(tmpList);

        List<Integer> ansList = new ArrayList<>();
        for(int i = 0; i < tmpList.size(); i++) {
            for(int j = 0; j < rank.length; j++) {
                if(tmpList.get(i) == rank[j]) {
                    ansList.add(j);
                }
            }
        }

        int answer = 10000 * ansList.get(0) + 100 * ansList.get(1) + ansList.get(2);

        return answer;
    }
}
