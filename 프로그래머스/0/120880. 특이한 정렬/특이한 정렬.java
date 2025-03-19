class Solution {
    public int[] solution(int[] numlist, int n) {
        for(int i = 0; i < numlist.length - 1; i++) {
            for(int j = i + 1; j < numlist.length; j++) {
                if(numlist[i] < numlist[j]) {
                    int temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                }
            }
        }
        
        int[] subList = new int[numlist.length];
        for(int i = 0; i < numlist.length; i++) {
            int sub = 0;
            if(numlist[i] > n) {
                sub = numlist[i] - n;
            } else {
                sub = n - numlist[i];
            }
            subList[i] = sub;
        }

        for(int i = 0; i < subList.length - 1; i++) {
            for(int j = i + 1; j < subList.length; j++) {
                if(subList[i] > subList[j]) {
                    int temp1 = subList[j];
                    subList[j] = subList[i];
                    subList[i] = temp1;

                    int temp2 = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp2;
                }
            }
        }

        return numlist;
    }
}