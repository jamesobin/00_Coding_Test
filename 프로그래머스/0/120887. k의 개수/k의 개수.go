func solution(i int, j int, k int) int {
    count := 0
    
    for x := i; x <= j; x++ {
        num := x
        
        for num > 0 {
            if num % 10 == k {
                count++
            }
            num /= 10
        }
        
        if x == 0 && k == 0 {
            count++
        }
    }
    
    return count
}