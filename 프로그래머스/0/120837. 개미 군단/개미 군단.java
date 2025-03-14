class Solution {
    public int solution(int hp) {
        int ant1 = hp / 5;
        int ant2 = (hp % 5) / 3;
        int ant3 = (hp % 5) % 3;
        
        int answer = ant1 + ant2 + ant3;
        return answer;
    }
}