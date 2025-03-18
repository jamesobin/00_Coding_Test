import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger num1 = new BigInteger("1");
        BigInteger num2 = new BigInteger("1");

        for (int i = (balls - share + 1); i <= balls; i++) {
            num1 = num1.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= share; i++) {
            num2 = num2.multiply(BigInteger.valueOf(i));
        }

        return num1.divide(num2);
    }
}