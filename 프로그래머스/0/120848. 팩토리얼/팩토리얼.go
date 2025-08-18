func solution(n int) int {
    factorial := 1
    i := 1

    for {
        factorial *= i
        
        if factorial <= n {
            i++
            continue
        } else {
            break
        }
    }

    return i - 1
}