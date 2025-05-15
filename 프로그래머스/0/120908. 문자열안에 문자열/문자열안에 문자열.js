function solution(str1, str2) {
    let answer = 2;
    
    if(str1.includes(str2)) {
        answer = 1;
    }
    
    return answer;
}