class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String tmp = "";
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                tmp += todo_list[i] + " ";
                
            }
            
        }
        
        tmp = tmp.trim();
        
        return tmp.split(" ");
    }
}