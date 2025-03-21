class Solution {
    public String[] solution(String my_string) {
        String[] tmp = my_string.split(" ");
        
        String strTmp = "";
        for(int i = 0; i < tmp.length; i++) {
            if(!tmp[i].equals("")) {
                strTmp += tmp[i] + " ";
            }
        }

        strTmp = strTmp.trim();
        String[] answer = strTmp.split(" ");

        return answer;
    }
}