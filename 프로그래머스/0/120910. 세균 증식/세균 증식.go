func solution(n int, t int) int {
    for i := 1; i <= t; i++ {
        n *= 2
    }

    return n
}