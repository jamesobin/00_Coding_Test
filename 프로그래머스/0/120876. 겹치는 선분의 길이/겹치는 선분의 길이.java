import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[][] lines) {
        List<Integer> numlist1 = new ArrayList<>();
        List<Integer> numlist2 = new ArrayList<>();
        List<Integer> numlist3 = new ArrayList<>();

        for(int i = lines[0][0]; i < lines[0][1]; i++) {
            numlist1.add(i);
        }
        for(int i = lines[1][0]; i < lines[1][1]; i++) {
            numlist2.add(i);
        }
        for(int i = lines[2][0]; i < lines[2][1]; i++) {
            numlist3.add(i);
        }

        int count1 = 0;
        for(int i = 0; i < numlist1.size(); i++) {
            for(int j = 0; j < numlist2.size(); j++) {
                if(numlist1.get(i) == numlist2.get(j)) {
                    count1 ++;
                }
            }
        }

        int count2 = 0;
        for(int i = 0; i < numlist2.size(); i++) {
            for(int j = 0; j < numlist3.size(); j++) {
                if(numlist2.get(i) == numlist3.get(j)) {
                    count2 ++;
                }
            }
        }

        int count3 = 0;
        for(int i = 0; i < numlist3.size(); i++) {
            for(int j = 0; j < numlist1.size(); j++) {
                if(numlist3.get(i) == numlist1.get(j)) {
                    count3 ++;
                }
            }
        }

        int count4 = 0;
        for(int i = 0; i < numlist1.size(); i++) {
            for(int j = 0; j < numlist2.size(); j++) {
                for(int k = 0; k < numlist3.size(); k++) {
                    if(numlist1.get(i) == numlist2.get(j) && numlist2.get(j) == numlist3.get(k) && numlist3.get(k) == numlist1.get(i)) {
                        count4 ++;
                    }
                }
            }
        }

        int answer = count1 + count2 + count3 - 2 * count4;

        return answer;
     }
}
