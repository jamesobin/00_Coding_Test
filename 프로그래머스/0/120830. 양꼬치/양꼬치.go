func solution(n int, k int) int {
    var service int = n / 10;
    var answer int = n * 12000 + (k - service) * 2000;
    
    return answer;
}