function solution(balls, share) {
    let num1 = 1;
    let num2 = 1;
    
    if (share === balls) {
        return 1;
    } else if((balls - share) > share) {
        for (let i = 1; i <= share; i++) {
            num1 *= (balls - i + 1);
            num2 *= i;
        }
        
        return num1 / num2;
    } else {
        for (let i = 1; i <= (balls - share); i++) {
            num1 *= (balls - i + 1);
            num2 *= i;
        }
        
        return num1 / num2;
    }
}