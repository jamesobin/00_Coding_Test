func solution(chicken int) int {
    var answer int = 0
    var service int = 0

    for chicken >= 10 {
        service = chicken / 10
        answer += service
        chicken = service + (chicken % 10)
    }

    return answer
}