func solution(hp int) int {
    var ant1 int = hp / 5;
    var ant2 int = (hp % 5) / 3;
    var ant3 int = (hp % 5) % 3;
        
    var answer int = ant1 + ant2 + ant3;
    return answer;
}