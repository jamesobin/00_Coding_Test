func solution(num_list []int) []int {
    tmp := 0
        
    for i := 0; i < (len(num_list) / 2); i++ {
        tmp = num_list[len(num_list) - 1 - i]
        num_list[len(num_list) - 1 - i] = num_list[i]
        num_list[i] = tmp
    }
    
    return num_list
}