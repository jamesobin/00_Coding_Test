class Solution {
    public int solution(String[] babbling) {
        String[] wordList = {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < wordList.length; j++) {
                babbling[i] = babbling[i].replace(wordList[j], " ");
            }
        }

        int count = 0;
        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i].equals("")) {
                count++;
            }
        }

        return count;
    }
}