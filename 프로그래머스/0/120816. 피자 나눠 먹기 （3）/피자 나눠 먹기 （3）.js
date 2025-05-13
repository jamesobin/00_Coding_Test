function solution(slice, n) {
    let answer = 0;
    
    if(n % slice === 0) {
        answer = n / slice;
    } else {
        answer = parseInt(n / slice) + 1;
    }
    
    return answer;
}