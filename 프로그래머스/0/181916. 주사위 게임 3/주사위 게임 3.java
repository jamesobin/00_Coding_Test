import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] diceArr = {a, b, c, d};
        List<Integer> countList = new ArrayList<>();

        for(int i = 0; i < diceArr.length; i++) {
            int count = 0;
            for(int j = 0 ; j < diceArr.length; j++) {
                if(diceArr[i] == diceArr[j]) {
                    count++;
                }
            }

            countList.add(count);
        }

        int answer = 0;
        List<Integer> tmpList = new ArrayList<>();
        
        if(countList.contains(4)) {
            answer = 1111 * a;
        } else if(countList.contains(3)) {
            for(int i = 0; i < diceArr.length; i++) {
                if(countList.get(i) == 3) {
                    tmpList.add(diceArr[i]);
                    break;
                }
            }
            for(int i = 0; i < diceArr.length; i++) {
                if(countList.get(i) == 1) {
                    tmpList.add(diceArr[i]);
                    break;
                }
            }
            answer = (tmpList.get(0) * 10 + tmpList.get(1)) * (tmpList.get(0) * 10 + tmpList.get(1));
        } else if(countList.contains(2)) {
            if(countList.contains(1)) {
                for(int i = 0; i < diceArr.length; i++) {
                    if(countList.get(i) == 1) {
                        tmpList.add(diceArr[i]);
                    }
                }
    
                answer = tmpList.get(0) * tmpList.get(1);
            } else {
                for(int i = 0; i < diceArr.length; i++) {
                    if(!tmpList.contains(diceArr[i])) {
                        tmpList.add(diceArr[i]);
                    }
                }

                answer = Math.abs(tmpList.get(0) - tmpList.get(1)) * (tmpList.get(0) + tmpList.get(1));
            }
        } else {
            int min = 6;
            for(int i = 0; i < diceArr.length; i++) {
                if(diceArr[i] < min) {
                    min = diceArr[i];
                }
            }

            answer = min;
        }

        return answer;
    }
}
