func solution(price int) int {
    var answer int = 0
        
    if price < 100000 {
        answer = price
    } else if 100000 <= price && price < 300000 {
        answer = int(float64(price) * 0.95)
    } else if 300000 <= price && price < 500000 {
        answer = int(float64(price) * 0.9)
    } else {
        answer = int(float64(price) * 0.8)
    }

    return answer;
}