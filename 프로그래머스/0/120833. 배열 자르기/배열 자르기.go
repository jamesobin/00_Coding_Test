func solution(numbers []int, num1 int, num2 int) []int {
    answer := make([]int, num2 - num1 + 1)
        
    for i := 0; i < len(numbers); i++ {
        if num1 <= i && i <= num2 {
            answer[i - num1] = numbers[i]
        }
    }

    return answer
}