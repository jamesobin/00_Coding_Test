class Solution {
    public String[] solution(String[] strArr) {
        String tmp = "";
        
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                tmp += (strArr[i] + " ");
            }
        }
        
        tmp = tmp.trim();
        String[] answer = tmp.split(" ");
        
        return answer;
    }
}