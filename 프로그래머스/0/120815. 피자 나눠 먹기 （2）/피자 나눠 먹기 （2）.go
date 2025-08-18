func solution(n int) int {
    answer := 1

    for {
        if answer * 6 % n == 0 {
            break
        }
        answer++
    }

    return answer
}