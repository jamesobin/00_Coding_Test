import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String answer = "";
        
        for(int i = 1; i <= n; i++) {
            answer = answer + "*";
            System.out.println(answer);
        }
    }
}