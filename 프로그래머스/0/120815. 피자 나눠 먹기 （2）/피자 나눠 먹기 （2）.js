function solution(n) {
    let answer = 1;
    
    while(true) {
        if(6 * answer % n !== 0) {
            answer++;
        } else {
            break;
        }
    }
    
    return answer;
}