function solution(n) {
    let factorial = 1;
    let i = 1;

    while(true) {
        factorial *= i;
        if(factorial <= n) {
            i++;
            continue;
        } else {
            break;
        }
    }

    return i-1;
}