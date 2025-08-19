func solution(money int) []int {
    answer := make([]int, 2)
        
    answer[0] = money / 5500
    answer[1] = money % 5500

    return answer
}