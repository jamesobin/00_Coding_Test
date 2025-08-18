func solution(n int) int {
    answer := 0
        
    for i := 1; i <= n; i++ {
        count := 0

        for j := 1; j <= i; j++ {
            if i % j == 0 {
                count++

                if count >= 3 {
                    answer++
                    break
                }
            }   
        }
    }

    return answer
}