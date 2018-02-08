import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (isPrime(n) == 0){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
    public static int isPrime(int n){
        if (n <= 2)
            return 1; // 0 is for prime
        for (int i = 2; i <= Math.sqrt(n); ++i){
            if (n % i == 0){
                return 1;
            }
        }
        return 0;
    }
}
