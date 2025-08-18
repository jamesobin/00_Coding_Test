func solution(n int) int {
    answer := 2

    for i := 1; i <= n/2; i++ {
        if i*i == n {
            answer = 1
            break
        }
    }

    return answer
}