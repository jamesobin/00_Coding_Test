func solution(numer1 int, denom1 int, numer2 int, denom2 int) [2]int {
    answer := [2]int{}
    
    answer[0] = numer1 * denom2 + numer2 * denom1
    answer[1] = denom1 * denom2

    min := answer[0]
    if answer[1] < min {
        min = answer[1]
    }
    if min < 0 {
        min = -min
    }

    for i := min; i > 0; i-- {
        if answer[0]%i == 0 && answer[1]%i == 0 {
            answer[0] /= i
            answer[1] /= i
            break
        }
    }

    return answer
}