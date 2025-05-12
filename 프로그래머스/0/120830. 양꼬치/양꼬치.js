function solution(n, k) {
    let answer = 12000 * n + 2000 * (k - parseInt(n / 10));
    return answer;
}