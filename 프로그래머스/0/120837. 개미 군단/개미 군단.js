function solution(hp) {
    let a = parseInt(hp / 5);
    let b = parseInt((hp % 5) / 3);
    let c = parseInt(((hp % 5) % 3) / 1);
    let answer = a + b + c;
    return answer;
}