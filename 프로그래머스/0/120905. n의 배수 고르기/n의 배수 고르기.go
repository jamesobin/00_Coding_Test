func solution(n int, numlist []int) []int {
    answer := []int{}
    
    for _, v := range numlist {
        if v % n == 0 {
            answer = append(answer, v)
        }
    }
    
    return answer
}