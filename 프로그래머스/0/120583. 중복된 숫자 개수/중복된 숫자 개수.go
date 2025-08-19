func solution(array []int, n int) int {
    answer := 0
    
    for _, v := range array {
        if v == n {
            answer++
        }
    }
    
    return answer
}