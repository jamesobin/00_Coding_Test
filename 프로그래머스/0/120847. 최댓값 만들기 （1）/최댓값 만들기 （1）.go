func solution(numbers []int) int {
    for i := 0; i < len(numbers) - 1; i++ {
        for j := i+1; j < len(numbers); j++ {
            if numbers[i] < numbers[j] {
                temp := numbers[j]
                
                numbers[j] = numbers[i]
                numbers[i] = temp
            }
        }
    }

    return numbers[0] * numbers[1];
}