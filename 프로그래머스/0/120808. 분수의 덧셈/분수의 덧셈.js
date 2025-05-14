function solution(numer1, denom1, numer2, denom2) {
    let answer = [];
    
    answer[0] = numer1 * denom2 + numer2 * denom1;
    answer[1] = denom1 * denom2;

    for(let i = answer[0]; i > 0; i--) {
        if(answer[0] % i === 0 && answer[1] % i === 0) {
            answer[0] /= i;
            answer[1] /= i;
        }
    }
    
    return answer;
}