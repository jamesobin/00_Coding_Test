function solution(money) {
    const answer = [parseInt(money / 5500), money % 5500];
    
    return answer;
}