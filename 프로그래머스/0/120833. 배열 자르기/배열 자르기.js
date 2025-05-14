function solution(numbers, num1, num2) {
    const answer = [];
    
    for(let i = num1; i <= num2; i++) {
        answer[i - num1] = numbers[i];
    }
    
    return answer;
}