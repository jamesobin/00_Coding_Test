func solution(numbers []int, direction string) []int {
    answer := make([]int, len(numbers))
        
    if direction == "right" {
        for i := 0; i < len(numbers)-1; i++ {
            answer[i+1] = numbers[i]
        }

        answer[0] = numbers[len(numbers)-1]
    } else {
        for i := 0; i < len(numbers)-1; i++ {
            answer[i] = numbers[i+1]
        }

        answer[len(numbers)-1] = numbers[0]
    }

    return answer
}