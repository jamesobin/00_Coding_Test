function solution(chicken) {
    let answer = 0;
    let service = 0;

    while(chicken >= 10) {
        service = parseInt(chicken / 10);
        answer += service;
        chicken = service + (chicken % 10);
    }

    return answer;
}